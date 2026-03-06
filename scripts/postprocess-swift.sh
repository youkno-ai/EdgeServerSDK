#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
SWIFT_SRC_DIR="$ROOT_DIR/swift/Sources/BelongSDK"
ANYCODABLE_FILE="$SWIFT_SRC_DIR/AnyCodable.swift"
CREDENTIALS_FILE="$SWIFT_SRC_DIR/Models/Credentials.swift"

[[ -d "$SWIFT_SRC_DIR" ]] || { echo "Missing $SWIFT_SRC_DIR" >&2; exit 1; }

if rg -q "AnyCodable" "$SWIFT_SRC_DIR" && [[ ! -f "$ANYCODABLE_FILE" ]]; then
  cat > "$ANYCODABLE_FILE" <<'EOF'
import Foundation

public struct AnyCodable: Codable, Hashable {
    public let value: Any

    public init(_ value: Any?) {
        self.value = value ?? ()
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if container.decodeNil() {
            self.init(())
        } else if let value = try? container.decode(Bool.self) {
            self.init(value)
        } else if let value = try? container.decode(Int.self) {
            self.init(value)
        } else if let value = try? container.decode(Double.self) {
            self.init(value)
        } else if let value = try? container.decode(String.self) {
            self.init(value)
        } else if let value = try? container.decode([String: AnyCodable].self) {
            self.init(value.mapValues(\.value))
        } else if let value = try? container.decode([AnyCodable].self) {
            self.init(value.map(\.value))
        } else {
            throw DecodingError.dataCorruptedError(in: container, debugDescription: "Unsupported AnyCodable value")
        }
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch value {
        case is Void:
            try container.encodeNil()
        case let value as Bool:
            try container.encode(value)
        case let value as Int:
            try container.encode(value)
        case let value as Double:
            try container.encode(value)
        case let value as String:
            try container.encode(value)
        case let value as [String: Any]:
            try container.encode(value.mapValues { AnyCodable($0) })
        case let value as [Any]:
            try container.encode(value.map { AnyCodable($0) })
        default:
            let context = EncodingError.Context(codingPath: container.codingPath, debugDescription: "Unsupported AnyCodable value")
            throw EncodingError.invalidValue(value, context)
        }
    }

    public static func == (lhs: AnyCodable, rhs: AnyCodable) -> Bool {
        String(describing: lhs.value) == String(describing: rhs.value)
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(String(describing: value))
    }
}
EOF
  echo "Injected AnyCodable.swift for generated Swift models"
fi

echo "Applied Swift post-generation patches"

if [[ -f "$CREDENTIALS_FILE" ]]; then
  perl -0pi -e 's/public var maskedCreds: Credentials\?/public var maskedCreds: AnyCodable?/g' "$CREDENTIALS_FILE"
  perl -0pi -e 's/maskedCreds: Credentials\? = nil/maskedCreds: AnyCodable? = nil/g' "$CREDENTIALS_FILE"
  echo "Patched recursive Credentials.maskedCreds type"
fi

for model_file in "$SWIFT_SRC_DIR"/Models/*.swift; do
  model_name="$(sed -n 's/^public struct \([A-Za-z0-9_]*\).*/\1/p' "$model_file" | head -n1)"
  if [[ -z "$model_name" ]]; then
    continue
  fi

  perl -0pi -e "s/public var ([A-Za-z0-9_]+): ${model_name}\\?/public var \\1: AnyCodable?/g" "$model_file"
  perl -0pi -e "s/(\\b[A-Za-z0-9_]+: )${model_name}(\\? = nil)/\\1AnyCodable\\2/g" "$model_file"
done

echo "Patched recursive self-referential Swift model fields"

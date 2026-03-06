#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
SWIFT_SRC_DIR="$ROOT_DIR/swift/Sources/BelongSDK"
ANYCODABLE_FILE="$SWIFT_SRC_DIR/AnyCodable.swift"
CLIENT_HELPER_FILE="$SWIFT_SRC_DIR/EdgeSDKClient.swift"

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

cat > "$CLIENT_HELPER_FILE" <<'EOF'
import Foundation

public struct EdgeSDKClientOptions {
    public var basePath: String
    public var bearerToken: String?
    public var xEdgeAgent: String?
    public var xEdgeState: String?
    public var xEdgeClientId: String?
    public var extraHeaders: [String: String]

    public init(
        basePath: String,
        bearerToken: String? = nil,
        xEdgeAgent: String? = nil,
        xEdgeState: String? = nil,
        xEdgeClientId: String? = nil,
        extraHeaders: [String: String] = [:]
    ) {
        self.basePath = basePath
        self.bearerToken = bearerToken
        self.xEdgeAgent = xEdgeAgent
        self.xEdgeState = xEdgeState
        self.xEdgeClientId = xEdgeClientId
        self.extraHeaders = extraHeaders
    }
}

public enum EdgeSDKClient {
    public static func configure(_ options: EdgeSDKClientOptions) {
        BelongSDKAPI.basePath = options.basePath
        var headers = options.extraHeaders
        if let token = options.bearerToken {
            headers["Authorization"] = "Bearer \(token)"
        }
        if let xEdgeAgent = options.xEdgeAgent {
            headers["X-edge-agent"] = xEdgeAgent
        }
        if let xEdgeState = options.xEdgeState {
            headers["X-edge-state"] = xEdgeState
        }
        if let xEdgeClientId = options.xEdgeClientId {
            headers["X-edge-client-id"] = xEdgeClientId
        }
        BelongSDKAPI.customHeaders = headers
    }
}
EOF

echo "Applied Swift post-generation patches"

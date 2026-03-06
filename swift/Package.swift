// swift-tools-version: 5.9
import PackageDescription

let sdkVersion = "1.20.2271"

let package = Package(
    name: "BelongSDK",
    platforms: [
        .iOS(.v13),
        .macOS(.v12)
    ],
    products: [
        .library(name: "BelongSDK", targets: ["BelongSDK"])
    ],
    dependencies: [
        .package(url: "https://github.com/apple/swift-openapi-runtime", from: "1.0.0"),
        .package(url: "https://github.com/apple/swift-openapi-urlsession", from: "1.0.0")
    ],
    targets: [
        .target(
            name: "BelongSDK",
            dependencies: [
                .product(name: "OpenAPIRuntime", package: "swift-openapi-runtime"),
                .product(name: "OpenAPIURLSession", package: "swift-openapi-urlsession")
            ],
            path: "Sources/BelongSDK"
        ),
        .testTarget(
            name: "BelongSDKTests",
            dependencies: ["BelongSDK"],
            path: "Tests/BelongSDKTests"
        )
    ]
)

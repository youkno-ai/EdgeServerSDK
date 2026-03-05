// swift-tools-version: 5.9
import PackageDescription

let sdkVersion = "0.0.0"

let package = Package(
    name: "BelongSDK",
    platforms: [
        .iOS(.v13),
        .macOS(.v12)
    ],
    products: [
        .library(name: "BelongSDK", targets: ["BelongSDK"])
    ],
    dependencies: [],
    targets: [
        .target(
            name: "BelongSDK",
            path: "Sources/BelongSDK"
        ),
        .testTarget(
            name: "BelongSDKTests",
            dependencies: ["BelongSDK"],
            path: "Tests/BelongSDKTests"
        )
    ]
)

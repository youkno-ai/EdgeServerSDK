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

//
// RepoHooksBody.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct RepoHooksBody: Codable {

    public enum ModelType: String, Codable { 
        case dagshub = "dagshub"
        case slack = "slack"
        case discord = "discord"
        case dingtalk = "dingtalk"
    }
    /** The type of webhook */
    public var type: ModelType
    public var config: WebhookConfig
    public var events: WebhookEvents?

    public init(type: ModelType, config: WebhookConfig, events: WebhookEvents? = nil) {
        self.type = type
        self.config = config
        self.events = events
    }


}
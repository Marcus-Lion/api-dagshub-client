//
// Files1.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct Files1: Codable {

    public var entries: [File]?
    public var limit: Int?
    public var nextToken: String?

    public init(entries: [File]? = nil, limit: Int? = nil, nextToken: String? = nil) {
        self.entries = entries
        self.limit = limit
        self.nextToken = nextToken
    }

    public enum CodingKeys: String, CodingKey { 
        case entries
        case limit
        case nextToken = "next_token"
    }

}
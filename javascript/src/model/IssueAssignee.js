/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.35
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';

/**
 * The IssueAssignee model module.
 * @module model/IssueAssignee
 * @version 1.0.1
 */
export class IssueAssignee {
  /**
   * Constructs a new <code>IssueAssignee</code>.
   * @alias module:model/IssueAssignee
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>IssueAssignee</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/IssueAssignee} obj Optional instance to populate.
   * @return {module:model/IssueAssignee} The populated <code>IssueAssignee</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new IssueAssignee();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('login'))
        obj.login = ApiClient.convertToType(data['login'], 'String');
      if (data.hasOwnProperty('full_name'))
        obj.fullName = ApiClient.convertToType(data['full_name'], 'String');
      if (data.hasOwnProperty('avatar_url'))
        obj.avatarUrl = ApiClient.convertToType(data['avatar_url'], 'String');
      if (data.hasOwnProperty('username'))
        obj.username = ApiClient.convertToType(data['username'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Number} id
 */
IssueAssignee.prototype.id = undefined;

/**
 * @member {String} login
 */
IssueAssignee.prototype.login = undefined;

/**
 * @member {String} fullName
 */
IssueAssignee.prototype.fullName = undefined;

/**
 * @member {String} avatarUrl
 */
IssueAssignee.prototype.avatarUrl = undefined;

/**
 * @member {String} username
 */
IssueAssignee.prototype.username = undefined;


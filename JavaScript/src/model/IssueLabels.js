/*
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
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
 * The IssueLabels model module.
 * @module model/IssueLabels
 * @version 1.0.2
 */
export class IssueLabels {
  /**
   * Constructs a new <code>IssueLabels</code>.
   * @alias module:model/IssueLabels
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>IssueLabels</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/IssueLabels} obj Optional instance to populate.
   * @return {module:model/IssueLabels} The populated <code>IssueLabels</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new IssueLabels();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('color'))
        obj.color = ApiClient.convertToType(data['color'], 'String');
      if (data.hasOwnProperty('url'))
        obj.url = ApiClient.convertToType(data['url'], 'String');
    }
    return obj;
  }
}

/**
 * @member {Number} id
 */
IssueLabels.prototype.id = undefined;

/**
 * @member {String} name
 */
IssueLabels.prototype.name = undefined;

/**
 * @member {String} color
 */
IssueLabels.prototype.color = undefined;

/**
 * @member {String} url
 */
IssueLabels.prototype.url = undefined;


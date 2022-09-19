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
 * The Assignee model module.
 * @module model/Assignee
 * @version 1.0.1
 */
export class Assignee {
  /**
   * Constructs a new <code>Assignee</code>.
   * Username for the user that this issue should be assigned to.   **Note:** Only users with write access can set the assignee for new issues.  The assignee is silently dropped otherwise.
   * @alias module:model/Assignee
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>Assignee</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Assignee} obj Optional instance to populate.
   * @return {module:model/Assignee} The populated <code>Assignee</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Assignee();
    }
    return obj;
  }
}

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
 * The Closed model module.
 * @module model/Closed
 * @version 1.0.1
 */
export class Closed {
  /**
   * Constructs a new <code>Closed</code>.
   * Indicate initial issue state as closed (**true**) or open (**false**).
   * @alias module:model/Closed
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>Closed</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Closed} obj Optional instance to populate.
   * @return {module:model/Closed} The populated <code>Closed</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Closed();
    }
    return obj;
  }
}

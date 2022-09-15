/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.0
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
 * Enum class State.
 * @enum {String}
 * @readonly
 */
const State = {
  /**
   * value: "open"
   * @const
   */
  open: "open",

  /**
   * value: "closed"
   * @const
   */
  closed: "closed",

  /**
   * Returns a <code>State</code> enum value from a JavaScript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
  * @return {module:model/State} The enum <code>State</code> value.
   */
  constructFromObject: function(object) {
    return object;
  }
};

export {State};
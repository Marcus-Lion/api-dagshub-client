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
import {ComponentsschemasAssigneeYaml} from './ComponentsschemasAssigneeYaml';
import {ComponentsschemasBodyYaml} from './ComponentsschemasBodyYaml';
import {ComponentsschemasClosedYaml} from './ComponentsschemasClosedYaml';
import {ComponentsschemasLabelsYaml} from './ComponentsschemasLabelsYaml';
import {ComponentsschemasMilestoneYaml} from './ComponentsschemasMilestoneYaml';
import {ComponentsschemasTitleYaml} from './ComponentsschemasTitleYaml';

/**
 * The PostIssue model module.
 * @module model/PostIssue
 * @version 1.0.2
 */
export class PostIssue {
  /**
   * Constructs a new <code>PostIssue</code>.
   * @alias module:model/PostIssue
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PostIssue</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PostIssue} obj Optional instance to populate.
   * @return {module:model/PostIssue} The populated <code>PostIssue</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PostIssue();
      if (data.hasOwnProperty('title'))
        obj.title = ComponentsschemasTitleYaml.constructFromObject(data['title']);
      if (data.hasOwnProperty('body'))
        obj.body = ComponentsschemasBodyYaml.constructFromObject(data['body']);
      if (data.hasOwnProperty('assignee'))
        obj.assignee = ComponentsschemasAssigneeYaml.constructFromObject(data['assignee']);
      if (data.hasOwnProperty('milestone'))
        obj.milestone = ComponentsschemasMilestoneYaml.constructFromObject(data['milestone']);
      if (data.hasOwnProperty('labels'))
        obj.labels = ComponentsschemasLabelsYaml.constructFromObject(data['labels']);
      if (data.hasOwnProperty('closed'))
        obj.closed = ComponentsschemasClosedYaml.constructFromObject(data['closed']);
    }
    return obj;
  }
}

/**
 * @member {module:model/ComponentsschemasTitleYaml} title
 */
PostIssue.prototype.title = undefined;

/**
 * @member {module:model/ComponentsschemasBodyYaml} body
 */
PostIssue.prototype.body = undefined;

/**
 * @member {module:model/ComponentsschemasAssigneeYaml} assignee
 */
PostIssue.prototype.assignee = undefined;

/**
 * @member {module:model/ComponentsschemasMilestoneYaml} milestone
 */
PostIssue.prototype.milestone = undefined;

/**
 * @member {module:model/ComponentsschemasLabelsYaml} labels
 */
PostIssue.prototype.labels = undefined;

/**
 * @member {module:model/ComponentsschemasClosedYaml} closed
 */
PostIssue.prototype.closed = undefined;


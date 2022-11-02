/* tslint:disable */
/* eslint-disable */
/**
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
/**
 * 
 * @export
 * @interface IssueMilestone
 */
export interface IssueMilestone {
    /**
     * 
     * @type {number}
     * @memberof IssueMilestone
     */
    id?: number;
    /**
     * 
     * @type {string}
     * @memberof IssueMilestone
     */
    title?: string;
    /**
     * 
     * @type {string}
     * @memberof IssueMilestone
     */
    description?: string;
    /**
     * 
     * @type {string}
     * @memberof IssueMilestone
     */
    state?: string;
    /**
     * 
     * @type {number}
     * @memberof IssueMilestone
     */
    openIssues?: number;
    /**
     * 
     * @type {number}
     * @memberof IssueMilestone
     */
    closedIssues?: number;
    /**
     * 
     * @type {string}
     * @memberof IssueMilestone
     */
    closedAt?: string;
    /**
     * 
     * @type {string}
     * @memberof IssueMilestone
     */
    dueOn?: string;
}
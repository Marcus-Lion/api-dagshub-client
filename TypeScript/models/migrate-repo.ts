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
 * @interface MigrateRepo
 */
export interface MigrateRepo {
    /**
     * Remote Git address (HTTP/HTTPS URL or local path)
     * @type {string}
     * @memberof MigrateRepo
     */
    cloneAddr: string;
    /**
     * Authorization username
     * @type {string}
     * @memberof MigrateRepo
     */
    authUsername?: string;
    /**
     * Authorization password
     * @type {string}
     * @memberof MigrateRepo
     */
    authPassword?: string;
    /**
     * User ID who takes ownership of this repository
     * @type {number}
     * @memberof MigrateRepo
     */
    userId: number;
    /**
     * Name of the repository
     * @type {string}
     * @memberof MigrateRepo
     */
    repoName?: string;
    /**
     * Repository will be a mirror (connected repository).
     * @type {boolean}
     * @memberof MigrateRepo
     */
    mirror?: boolean;
    /**
     * Repository will be private or public.
     * @type {string}
     * @memberof MigrateRepo
     */
    visibility?: MigrateRepoVisibilityEnum;
    /**
     * Description of the repository
     * @type {string}
     * @memberof MigrateRepo
     */
    description?: string;
}

/**
    * @export
    * @enum {string}
    */
export enum MigrateRepoVisibilityEnum {
    Private = 'private',
    Public = 'public'
}


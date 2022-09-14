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
import {ApiClient} from './ApiClient';
import {Assignee} from './model/Assignee';
import {Body} from './model/Body';
import {Closed} from './model/Closed';
import {CollaboratorsCollaboratorBody} from './model/CollaboratorsCollaboratorBody';
import {CreateRepo} from './model/CreateRepo';
import {HooksIdBody} from './model/HooksIdBody';
import {Issue} from './model/Issue';
import {IssueAssignee} from './model/IssueAssignee';
import {IssueLabels} from './model/IssueLabels';
import {IssueMilestone} from './model/IssueMilestone';
import {Issues} from './model/Issues';
import {Labels} from './model/Labels';
import {MigrateRepo} from './model/MigrateRepo';
import {Milestone} from './model/Milestone';
import {PatchIssue} from './model/PatchIssue';
import {PostIssue} from './model/PostIssue';
import {RepoHooksBody} from './model/RepoHooksBody';
import {State} from './model/State';
import {Title} from './model/Title';
import {User} from './model/User';
import {WebhookConfig} from './model/WebhookConfig';
import {WebhookEvents} from './model/WebhookEvents';
import {BranchesApi} from './dagshub_api/BranchesApi';
import {CollaboratorsApi} from './dagshub_api/CollaboratorsApi';
import {CommitsApi} from './dagshub_api/CommitsApi';
import {ContentApi} from './dagshub_api/ContentApi';
import {IssuesApi} from './dagshub_api/IssuesApi';
import {ReleasesApi} from './dagshub_api/ReleasesApi';
import {RepositoryApi} from './dagshub_api/RepositoryApi';
import {WebhooksApi} from './dagshub_api/WebhooksApi';

/**
* The_api_docs_are_made_with_SwaggerUI_using_the_OpenAPI_3_specification_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var DagsHubApi = require('index'); // See note below*.
* var xxxSvc = new DagsHubApi.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new DagsHubApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new DagsHubApi.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new DagsHubApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.0.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Assignee model constructor.
     * @property {module:model/Assignee}
     */
    Assignee,

    /**
     * The Body model constructor.
     * @property {module:model/Body}
     */
    Body,

    /**
     * The Closed model constructor.
     * @property {module:model/Closed}
     */
    Closed,

    /**
     * The CollaboratorsCollaboratorBody model constructor.
     * @property {module:model/CollaboratorsCollaboratorBody}
     */
    CollaboratorsCollaboratorBody,

    /**
     * The CreateRepo model constructor.
     * @property {module:model/CreateRepo}
     */
    CreateRepo,

    /**
     * The HooksIdBody model constructor.
     * @property {module:model/HooksIdBody}
     */
    HooksIdBody,

    /**
     * The Issue model constructor.
     * @property {module:model/Issue}
     */
    Issue,

    /**
     * The IssueAssignee model constructor.
     * @property {module:model/IssueAssignee}
     */
    IssueAssignee,

    /**
     * The IssueLabels model constructor.
     * @property {module:model/IssueLabels}
     */
    IssueLabels,

    /**
     * The IssueMilestone model constructor.
     * @property {module:model/IssueMilestone}
     */
    IssueMilestone,

    /**
     * The Issues model constructor.
     * @property {module:model/Issues}
     */
    Issues,

    /**
     * The Labels model constructor.
     * @property {module:model/Labels}
     */
    Labels,

    /**
     * The MigrateRepo model constructor.
     * @property {module:model/MigrateRepo}
     */
    MigrateRepo,

    /**
     * The Milestone model constructor.
     * @property {module:model/Milestone}
     */
    Milestone,

    /**
     * The PatchIssue model constructor.
     * @property {module:model/PatchIssue}
     */
    PatchIssue,

    /**
     * The PostIssue model constructor.
     * @property {module:model/PostIssue}
     */
    PostIssue,

    /**
     * The RepoHooksBody model constructor.
     * @property {module:model/RepoHooksBody}
     */
    RepoHooksBody,

    /**
     * The State model constructor.
     * @property {module:model/State}
     */
    State,

    /**
     * The Title model constructor.
     * @property {module:model/Title}
     */
    Title,

    /**
     * The User model constructor.
     * @property {module:model/User}
     */
    User,

    /**
     * The WebhookConfig model constructor.
     * @property {module:model/WebhookConfig}
     */
    WebhookConfig,

    /**
     * The WebhookEvents model constructor.
     * @property {module:model/WebhookEvents}
     */
    WebhookEvents,

    /**
    * The BranchesApi service constructor.
    * @property {module:dagshub_api/BranchesApi}
    */
    BranchesApi,

    /**
    * The CollaboratorsApi service constructor.
    * @property {module:dagshub_api/CollaboratorsApi}
    */
    CollaboratorsApi,

    /**
    * The CommitsApi service constructor.
    * @property {module:dagshub_api/CommitsApi}
    */
    CommitsApi,

    /**
    * The ContentApi service constructor.
    * @property {module:dagshub_api/ContentApi}
    */
    ContentApi,

    /**
    * The IssuesApi service constructor.
    * @property {module:dagshub_api/IssuesApi}
    */
    IssuesApi,

    /**
    * The ReleasesApi service constructor.
    * @property {module:dagshub_api/ReleasesApi}
    */
    ReleasesApi,

    /**
    * The RepositoryApi service constructor.
    * @property {module:dagshub_api/RepositoryApi}
    */
    RepositoryApi,

    /**
    * The WebhooksApi service constructor.
    * @property {module:dagshub_api/WebhooksApi}
    */
    WebhooksApi
};

/* tslint:disable */
/* eslint-disable */
/**
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import globalAxios, { AxiosResponse, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
import { CreateRepo } from '../models';
import { MigrateRepo } from '../models';
/**
 * RepositoryApi - axios parameter creator
 * @export
 */
export const RepositoryApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Create a new repository in this organization. The authenticated user must be an **owner** of the specified organization.
         * @summary Create in organization
         * @param {string} orgname A DagsHub organization name
         * @param {CreateRepo} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createOrgRepo: async (orgname: string, body?: CreateRepo, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'orgname' is not null or undefined
            if (orgname === null || orgname === undefined) {
                throw new RequiredError('orgname','Required parameter orgname was null or undefined when calling createOrgRepo.');
            }
            const localVarPath = `/org/{orgname}/repos`
                .replace(`{${"orgname"}}`, encodeURIComponent(String(orgname)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            const needsSerialization = (typeof body !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(body !== undefined ? body : {}) : (body || "");

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * Create a new repository for the authenticated user.
         * @summary Create
         * @param {CreateRepo} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createRepo: async (body?: CreateRepo, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/user/repos`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            const needsSerialization = (typeof body !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(body !== undefined ? body : {}) : (body || "");

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * List repositories that are accessible to the authenticated user.  This includes repositories owned by the authenticated user, repositories where the authenticated user is a collaborator, and repositories that the authenticated user has access to through an organization membership. 
         * @summary List your repositories
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listMyRepos: async (options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/user/repos`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * List repositories that are accessible to the authenticated user.
         * @summary List organization repositories
         * @param {string} orgname A DagsHub organization name
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listOrgRepos: async (orgname: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'orgname' is not null or undefined
            if (orgname === null || orgname === undefined) {
                throw new RequiredError('orgname','Required parameter orgname was null or undefined when calling listOrgRepos.');
            }
            const localVarPath = `/orgs/{orgname}/repos`
                .replace(`{${"orgname"}}`, encodeURIComponent(String(orgname)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * List public repositories for the specified user.
         * @summary List user repositories
         * @param {string} username A DagsHub username
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listUserRepos: async (username: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'username' is not null or undefined
            if (username === null || username === undefined) {
                throw new RequiredError('username','Required parameter username was null or undefined when calling listUserRepos.');
            }
            const localVarPath = `/users/{username}/repos`
                .replace(`{${"username"}}`, encodeURIComponent(String(username)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * Migrate a repository from other Git hosting sources for the authenticated user.  To migrate a repository for a organization, the authenticated user must be a **owner** of the specified organization. 
         * @summary Migrate repository
         * @param {MigrateRepo} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        migrateRepo: async (body?: MigrateRepo, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/repos/migrate`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            localVarHeaderParameter['Content-Type'] = 'application/json';

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            const needsSerialization = (typeof body !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.data =  needsSerialization ? JSON.stringify(body !== undefined ? body : {}) : (body || "");

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Search repositories
         * @param {string} q 
         * @param {number} [uid] User ID to specify search whose repositories. Default is 0 and search all repositories
         * @param {number} [limit] Maximum number of repositories in search results.
         * @param {number} [page] Page number. Default is 1.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        search: async (q: string, uid?: number, limit?: number, page?: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'q' is not null or undefined
            if (q === null || q === undefined) {
                throw new RequiredError('q','Required parameter q was null or undefined when calling search.');
            }
            const localVarPath = `/repos/search`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication basicAuth required

            // authentication tokenAuth required
            if (configuration && configuration.apiKey) {
                const localVarApiKeyValue = typeof configuration.apiKey === 'function'
                    ? await configuration.apiKey("token")
                    : await configuration.apiKey;
                localVarQueryParameter["token"] = localVarApiKeyValue;
            }

            if (q !== undefined) {
                localVarQueryParameter['q'] = q;
            }

            if (uid !== undefined) {
                localVarQueryParameter['uid'] = uid;
            }

            if (limit !== undefined) {
                localVarQueryParameter['limit'] = limit;
            }

            if (page !== undefined) {
                localVarQueryParameter['page'] = page;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * RepositoryApi - functional programming interface
 * @export
 */
export const RepositoryApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Create a new repository in this organization. The authenticated user must be an **owner** of the specified organization.
         * @summary Create in organization
         * @param {string} orgname A DagsHub organization name
         * @param {CreateRepo} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createOrgRepo(orgname: string, body?: CreateRepo, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await RepositoryApiAxiosParamCreator(configuration).createOrgRepo(orgname, body, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * Create a new repository for the authenticated user.
         * @summary Create
         * @param {CreateRepo} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createRepo(body?: CreateRepo, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await RepositoryApiAxiosParamCreator(configuration).createRepo(body, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * List repositories that are accessible to the authenticated user.  This includes repositories owned by the authenticated user, repositories where the authenticated user is a collaborator, and repositories that the authenticated user has access to through an organization membership. 
         * @summary List your repositories
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listMyRepos(options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<any>>> {
            const localVarAxiosArgs = await RepositoryApiAxiosParamCreator(configuration).listMyRepos(options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * List repositories that are accessible to the authenticated user.
         * @summary List organization repositories
         * @param {string} orgname A DagsHub organization name
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listOrgRepos(orgname: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await RepositoryApiAxiosParamCreator(configuration).listOrgRepos(orgname, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * List public repositories for the specified user.
         * @summary List user repositories
         * @param {string} username A DagsHub username
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listUserRepos(username: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await RepositoryApiAxiosParamCreator(configuration).listUserRepos(username, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * Migrate a repository from other Git hosting sources for the authenticated user.  To migrate a repository for a organization, the authenticated user must be a **owner** of the specified organization. 
         * @summary Migrate repository
         * @param {MigrateRepo} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async migrateRepo(body?: MigrateRepo, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await RepositoryApiAxiosParamCreator(configuration).migrateRepo(body, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * 
         * @summary Search repositories
         * @param {string} q 
         * @param {number} [uid] User ID to specify search whose repositories. Default is 0 and search all repositories
         * @param {number} [limit] Maximum number of repositories in search results.
         * @param {number} [page] Page number. Default is 1.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async search(q: string, uid?: number, limit?: number, page?: number, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<any>>> {
            const localVarAxiosArgs = await RepositoryApiAxiosParamCreator(configuration).search(q, uid, limit, page, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
    }
};

/**
 * RepositoryApi - factory interface
 * @export
 */
export const RepositoryApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * Create a new repository in this organization. The authenticated user must be an **owner** of the specified organization.
         * @summary Create in organization
         * @param {string} orgname A DagsHub organization name
         * @param {CreateRepo} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createOrgRepo(orgname: string, body?: CreateRepo, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return RepositoryApiFp(configuration).createOrgRepo(orgname, body, options).then((request) => request(axios, basePath));
        },
        /**
         * Create a new repository for the authenticated user.
         * @summary Create
         * @param {CreateRepo} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createRepo(body?: CreateRepo, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return RepositoryApiFp(configuration).createRepo(body, options).then((request) => request(axios, basePath));
        },
        /**
         * List repositories that are accessible to the authenticated user.  This includes repositories owned by the authenticated user, repositories where the authenticated user is a collaborator, and repositories that the authenticated user has access to through an organization membership. 
         * @summary List your repositories
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listMyRepos(options?: AxiosRequestConfig): Promise<AxiosResponse<any>> {
            return RepositoryApiFp(configuration).listMyRepos(options).then((request) => request(axios, basePath));
        },
        /**
         * List repositories that are accessible to the authenticated user.
         * @summary List organization repositories
         * @param {string} orgname A DagsHub organization name
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listOrgRepos(orgname: string, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return RepositoryApiFp(configuration).listOrgRepos(orgname, options).then((request) => request(axios, basePath));
        },
        /**
         * List public repositories for the specified user.
         * @summary List user repositories
         * @param {string} username A DagsHub username
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listUserRepos(username: string, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return RepositoryApiFp(configuration).listUserRepos(username, options).then((request) => request(axios, basePath));
        },
        /**
         * Migrate a repository from other Git hosting sources for the authenticated user.  To migrate a repository for a organization, the authenticated user must be a **owner** of the specified organization. 
         * @summary Migrate repository
         * @param {MigrateRepo} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async migrateRepo(body?: MigrateRepo, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return RepositoryApiFp(configuration).migrateRepo(body, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Search repositories
         * @param {string} q 
         * @param {number} [uid] User ID to specify search whose repositories. Default is 0 and search all repositories
         * @param {number} [limit] Maximum number of repositories in search results.
         * @param {number} [page] Page number. Default is 1.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async search(q: string, uid?: number, limit?: number, page?: number, options?: AxiosRequestConfig): Promise<AxiosResponse<any>> {
            return RepositoryApiFp(configuration).search(q, uid, limit, page, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * RepositoryApi - object-oriented interface
 * @export
 * @class RepositoryApi
 * @extends {BaseAPI}
 */
export class RepositoryApi extends BaseAPI {
    /**
     * Create a new repository in this organization. The authenticated user must be an **owner** of the specified organization.
     * @summary Create in organization
     * @param {string} orgname A DagsHub organization name
     * @param {CreateRepo} [body] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RepositoryApi
     */
    public async createOrgRepo(orgname: string, body?: CreateRepo, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return RepositoryApiFp(this.configuration).createOrgRepo(orgname, body, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Create a new repository for the authenticated user.
     * @summary Create
     * @param {CreateRepo} [body] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RepositoryApi
     */
    public async createRepo(body?: CreateRepo, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return RepositoryApiFp(this.configuration).createRepo(body, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * List repositories that are accessible to the authenticated user.  This includes repositories owned by the authenticated user, repositories where the authenticated user is a collaborator, and repositories that the authenticated user has access to through an organization membership. 
     * @summary List your repositories
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RepositoryApi
     */
    public async listMyRepos(options?: AxiosRequestConfig) : Promise<AxiosResponse<any>> {
        return RepositoryApiFp(this.configuration).listMyRepos(options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * List repositories that are accessible to the authenticated user.
     * @summary List organization repositories
     * @param {string} orgname A DagsHub organization name
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RepositoryApi
     */
    public async listOrgRepos(orgname: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return RepositoryApiFp(this.configuration).listOrgRepos(orgname, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * List public repositories for the specified user.
     * @summary List user repositories
     * @param {string} username A DagsHub username
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RepositoryApi
     */
    public async listUserRepos(username: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return RepositoryApiFp(this.configuration).listUserRepos(username, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * Migrate a repository from other Git hosting sources for the authenticated user.  To migrate a repository for a organization, the authenticated user must be a **owner** of the specified organization. 
     * @summary Migrate repository
     * @param {MigrateRepo} [body] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RepositoryApi
     */
    public async migrateRepo(body?: MigrateRepo, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return RepositoryApiFp(this.configuration).migrateRepo(body, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * 
     * @summary Search repositories
     * @param {string} q 
     * @param {number} [uid] User ID to specify search whose repositories. Default is 0 and search all repositories
     * @param {number} [limit] Maximum number of repositories in search results.
     * @param {number} [page] Page number. Default is 1.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof RepositoryApi
     */
    public async search(q: string, uid?: number, limit?: number, page?: number, options?: AxiosRequestConfig) : Promise<AxiosResponse<any>> {
        return RepositoryApiFp(this.configuration).search(q, uid, limit, page, options).then((request) => request(this.axios, this.basePath));
    }
}

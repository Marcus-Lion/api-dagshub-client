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
import { HooksIdBody } from '../models';
import { RepoHooksBody } from '../models';
/**
 * WebhooksApi - axios parameter creator
 * @export
 */
export const WebhooksApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Create a hook
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {RepoHooksBody} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        createHook: async (owner: string, repo: string, body?: RepoHooksBody, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling createHook.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling createHook.');
            }
            const localVarPath = `/repos/{owner}/{repo}/hooks`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)));
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
         * @summary Delete a hook
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {number} id 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteHook: async (owner: string, repo: string, id: number, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling deleteHook.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling deleteHook.');
            }
            // verify required parameter 'id' is not null or undefined
            if (id === null || id === undefined) {
                throw new RequiredError('id','Required parameter id was null or undefined when calling deleteHook.');
            }
            const localVarPath = `/repos/{owner}/{repo}/hooks/{id}`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)))
                .replace(`{${"id"}}`, encodeURIComponent(String(id)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'DELETE', ...baseOptions, ...options};
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
         * 
         * @summary Edit a hook
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {number} id 
         * @param {HooksIdBody} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        editHook: async (owner: string, repo: string, id: number, body?: HooksIdBody, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling editHook.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling editHook.');
            }
            // verify required parameter 'id' is not null or undefined
            if (id === null || id === undefined) {
                throw new RequiredError('id','Required parameter id was null or undefined when calling editHook.');
            }
            const localVarPath = `/repos/{owner}/{repo}/hooks/{id}`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)))
                .replace(`{${"id"}}`, encodeURIComponent(String(id)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'PATCH', ...baseOptions, ...options};
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
         * @summary List hooks
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listHooks: async (owner: string, repo: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling listHooks.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling listHooks.');
            }
            const localVarPath = `/repos/{owner}/{repo}/hooks`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)));
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
    }
};

/**
 * WebhooksApi - functional programming interface
 * @export
 */
export const WebhooksApiFp = function(configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Create a hook
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {RepoHooksBody} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createHook(owner: string, repo: string, body?: RepoHooksBody, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await WebhooksApiAxiosParamCreator(configuration).createHook(owner, repo, body, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * 
         * @summary Delete a hook
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {number} id 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async deleteHook(owner: string, repo: string, id: number, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await WebhooksApiAxiosParamCreator(configuration).deleteHook(owner, repo, id, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * 
         * @summary Edit a hook
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {number} id 
         * @param {HooksIdBody} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async editHook(owner: string, repo: string, id: number, body?: HooksIdBody, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await WebhooksApiAxiosParamCreator(configuration).editHook(owner, repo, id, body, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * 
         * @summary List hooks
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listHooks(owner: string, repo: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await WebhooksApiAxiosParamCreator(configuration).listHooks(owner, repo, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
    }
};

/**
 * WebhooksApi - factory interface
 * @export
 */
export const WebhooksApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * 
         * @summary Create a hook
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {RepoHooksBody} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async createHook(owner: string, repo: string, body?: RepoHooksBody, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return WebhooksApiFp(configuration).createHook(owner, repo, body, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Delete a hook
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {number} id 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async deleteHook(owner: string, repo: string, id: number, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return WebhooksApiFp(configuration).deleteHook(owner, repo, id, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Edit a hook
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {number} id 
         * @param {HooksIdBody} [body] 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async editHook(owner: string, repo: string, id: number, body?: HooksIdBody, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return WebhooksApiFp(configuration).editHook(owner, repo, id, body, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary List hooks
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listHooks(owner: string, repo: string, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return WebhooksApiFp(configuration).listHooks(owner, repo, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * WebhooksApi - object-oriented interface
 * @export
 * @class WebhooksApi
 * @extends {BaseAPI}
 */
export class WebhooksApi extends BaseAPI {
    /**
     * 
     * @summary Create a hook
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {RepoHooksBody} [body] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebhooksApi
     */
    public async createHook(owner: string, repo: string, body?: RepoHooksBody, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return WebhooksApiFp(this.configuration).createHook(owner, repo, body, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * 
     * @summary Delete a hook
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {number} id 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebhooksApi
     */
    public async deleteHook(owner: string, repo: string, id: number, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return WebhooksApiFp(this.configuration).deleteHook(owner, repo, id, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * 
     * @summary Edit a hook
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {number} id 
     * @param {HooksIdBody} [body] 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebhooksApi
     */
    public async editHook(owner: string, repo: string, id: number, body?: HooksIdBody, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return WebhooksApiFp(this.configuration).editHook(owner, repo, id, body, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * 
     * @summary List hooks
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof WebhooksApi
     */
    public async listHooks(owner: string, repo: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return WebhooksApiFp(this.configuration).listHooks(owner, repo, options).then((request) => request(this.axios, this.basePath));
    }
}

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
/**
 * CommitsApi - axios parameter creator
 * @export
 */
export const CommitsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Get a single commit
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} sha a SHA1 of a commit
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCommit: async (owner: string, repo: string, sha: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling getCommit.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling getCommit.');
            }
            // verify required parameter 'sha' is not null or undefined
            if (sha === null || sha === undefined) {
                throw new RequiredError('sha','Required parameter sha was null or undefined when calling getCommit.');
            }
            const localVarPath = `/repos/{owner}/{repo}/commits/{sha}`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)))
                .replace(`{${"sha"}}`, encodeURIComponent(String(sha)));
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
         * 
         * @summary Get the SHA-1 of a commit reference
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} ref The name of the commit/branch/tag
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCommitSha1: async (owner: string, repo: string, ref: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'owner' is not null or undefined
            if (owner === null || owner === undefined) {
                throw new RequiredError('owner','Required parameter owner was null or undefined when calling getCommitSha1.');
            }
            // verify required parameter 'repo' is not null or undefined
            if (repo === null || repo === undefined) {
                throw new RequiredError('repo','Required parameter repo was null or undefined when calling getCommitSha1.');
            }
            // verify required parameter 'ref' is not null or undefined
            if (ref === null || ref === undefined) {
                throw new RequiredError('ref','Required parameter ref was null or undefined when calling getCommitSha1.');
            }
            const localVarPath = `/repos/{owner}/{repo}/commits/{ref}`
                .replace(`{${"owner"}}`, encodeURIComponent(String(owner)))
                .replace(`{${"repo"}}`, encodeURIComponent(String(repo)))
                .replace(`{${"ref"}}`, encodeURIComponent(String(ref)));
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
 * CommitsApi - functional programming interface
 * @export
 */
export const CommitsApiFp = function(configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Get a single commit
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} sha a SHA1 of a commit
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCommit(owner: string, repo: string, sha: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<void>>> {
            const localVarAxiosArgs = await CommitsApiAxiosParamCreator(configuration).getCommit(owner, repo, sha, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
        /**
         * 
         * @summary Get the SHA-1 of a commit reference
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} ref The name of the commit/branch/tag
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCommitSha1(owner: string, repo: string, ref: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<string>>> {
            const localVarAxiosArgs = await CommitsApiAxiosParamCreator(configuration).getCommitSha1(owner, repo, ref, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
    }
};

/**
 * CommitsApi - factory interface
 * @export
 */
export const CommitsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * 
         * @summary Get a single commit
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} sha a SHA1 of a commit
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCommit(owner: string, repo: string, sha: string, options?: AxiosRequestConfig): Promise<AxiosResponse<void>> {
            return CommitsApiFp(configuration).getCommit(owner, repo, sha, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Get the SHA-1 of a commit reference
         * @param {string} owner owner of the repository
         * @param {string} repo name of the repository
         * @param {string} ref The name of the commit/branch/tag
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCommitSha1(owner: string, repo: string, ref: string, options?: AxiosRequestConfig): Promise<AxiosResponse<string>> {
            return CommitsApiFp(configuration).getCommitSha1(owner, repo, ref, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * CommitsApi - object-oriented interface
 * @export
 * @class CommitsApi
 * @extends {BaseAPI}
 */
export class CommitsApi extends BaseAPI {
    /**
     * 
     * @summary Get a single commit
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {string} sha a SHA1 of a commit
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof CommitsApi
     */
    public async getCommit(owner: string, repo: string, sha: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<void>> {
        return CommitsApiFp(this.configuration).getCommit(owner, repo, sha, options).then((request) => request(this.axios, this.basePath));
    }
    /**
     * 
     * @summary Get the SHA-1 of a commit reference
     * @param {string} owner owner of the repository
     * @param {string} repo name of the repository
     * @param {string} ref The name of the commit/branch/tag
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof CommitsApi
     */
    public async getCommitSha1(owner: string, repo: string, ref: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<string>> {
        return CommitsApiFp(this.configuration).getCommitSha1(owner, repo, ref, options).then((request) => request(this.axios, this.basePath));
    }
}

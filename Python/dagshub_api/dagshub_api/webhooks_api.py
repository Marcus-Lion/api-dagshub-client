# coding: utf-8

"""
    DagsHub API

    The api docs are made with SwaggerUI using the OpenAPI 3 specification.   # noqa: E501

    OpenAPI spec version: 0.1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from dagshub_api.api_client import ApiClient


class WebhooksApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def create_hook(self, owner, repo, **kwargs):  # noqa: E501
        """Create a hook  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_hook(owner, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param RepoHooksBody body:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_hook_with_http_info(owner, repo, **kwargs)  # noqa: E501
        else:
            (data) = self.create_hook_with_http_info(owner, repo, **kwargs)  # noqa: E501
            return data

    def create_hook_with_http_info(self, owner, repo, **kwargs):  # noqa: E501
        """Create a hook  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_hook_with_http_info(owner, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param RepoHooksBody body:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'repo', 'body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_hook" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if ('owner' not in params or
                params['owner'] is None):
            raise ValueError("Missing the required parameter `owner` when calling `create_hook`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `create_hook`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{owner}/{repo}/hooks', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def delete_hook(self, owner, repo, id, **kwargs):  # noqa: E501
        """Delete a hook  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_hook(owner, repo, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param int id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_hook_with_http_info(owner, repo, id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_hook_with_http_info(owner, repo, id, **kwargs)  # noqa: E501
            return data

    def delete_hook_with_http_info(self, owner, repo, id, **kwargs):  # noqa: E501
        """Delete a hook  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_hook_with_http_info(owner, repo, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param int id: (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'repo', 'id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_hook" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if ('owner' not in params or
                params['owner'] is None):
            raise ValueError("Missing the required parameter `owner` when calling `delete_hook`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `delete_hook`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `delete_hook`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501
        if 'id' in params:
            path_params['id'] = params['id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{owner}/{repo}/hooks/{id}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def edit_hook(self, owner, repo, id, **kwargs):  # noqa: E501
        """Edit a hook  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.edit_hook(owner, repo, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param int id: (required)
        :param HooksIdBody body:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.edit_hook_with_http_info(owner, repo, id, **kwargs)  # noqa: E501
        else:
            (data) = self.edit_hook_with_http_info(owner, repo, id, **kwargs)  # noqa: E501
            return data

    def edit_hook_with_http_info(self, owner, repo, id, **kwargs):  # noqa: E501
        """Edit a hook  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.edit_hook_with_http_info(owner, repo, id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param int id: (required)
        :param HooksIdBody body:
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'repo', 'id', 'body']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method edit_hook" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if ('owner' not in params or
                params['owner'] is None):
            raise ValueError("Missing the required parameter `owner` when calling `edit_hook`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `edit_hook`")  # noqa: E501
        # verify the required parameter 'id' is set
        if ('id' not in params or
                params['id'] is None):
            raise ValueError("Missing the required parameter `id` when calling `edit_hook`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501
        if 'id' in params:
            path_params['id'] = params['id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{owner}/{repo}/hooks/{id}', 'PATCH',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def list_hooks(self, owner, repo, **kwargs):  # noqa: E501
        """List hooks  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_hooks(owner, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.list_hooks_with_http_info(owner, repo, **kwargs)  # noqa: E501
        else:
            (data) = self.list_hooks_with_http_info(owner, repo, **kwargs)  # noqa: E501
            return data

    def list_hooks_with_http_info(self, owner, repo, **kwargs):  # noqa: E501
        """List hooks  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_hooks_with_http_info(owner, repo, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'repo']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method list_hooks" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if ('owner' not in params or
                params['owner'] is None):
            raise ValueError("Missing the required parameter `owner` when calling `list_hooks`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `list_hooks`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['basicAuth', 'tokenAuth']  # noqa: E501

        return self.api_client.call_api(
            '/repos/{owner}/{repo}/hooks', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

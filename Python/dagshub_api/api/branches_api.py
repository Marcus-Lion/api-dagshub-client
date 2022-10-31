# coding: utf-8

"""
    DagsHub API

    This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training.   # noqa: E501

    OpenAPI spec version: 1.0.2
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from dagshub_api.api_client import ApiClient


class BranchesApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_branch(self, owner, repo, branch, **kwargs):  # noqa: E501
        """Get Branch  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_branch(owner, repo, branch, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param str branch: branch of the repository (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_branch_with_http_info(owner, repo, branch, **kwargs)  # noqa: E501
        else:
            (data) = self.get_branch_with_http_info(owner, repo, branch, **kwargs)  # noqa: E501
            return data

    def get_branch_with_http_info(self, owner, repo, branch, **kwargs):  # noqa: E501
        """Get Branch  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_branch_with_http_info(owner, repo, branch, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str owner: owner of the repository (required)
        :param str repo: name of the repository (required)
        :param str branch: branch of the repository (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['owner', 'repo', 'branch']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_branch" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if ('owner' not in params or
                params['owner'] is None):
            raise ValueError("Missing the required parameter `owner` when calling `get_branch`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `get_branch`")  # noqa: E501
        # verify the required parameter 'branch' is set
        if ('branch' not in params or
                params['branch'] is None):
            raise ValueError("Missing the required parameter `branch` when calling `get_branch`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'owner' in params:
            path_params['owner'] = params['owner']  # noqa: E501
        if 'repo' in params:
            path_params['repo'] = params['repo']  # noqa: E501
        if 'branch' in params:
            path_params['branch'] = params['branch']  # noqa: E501

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
            '/repos/{owner}/{repo}/branches/{branch}', 'GET',
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

    def list_branches(self, owner, repo, **kwargs):  # noqa: E501
        """List Branches  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_branches(owner, repo, async_req=True)
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
            return self.list_branches_with_http_info(owner, repo, **kwargs)  # noqa: E501
        else:
            (data) = self.list_branches_with_http_info(owner, repo, **kwargs)  # noqa: E501
            return data

    def list_branches_with_http_info(self, owner, repo, **kwargs):  # noqa: E501
        """List Branches  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.list_branches_with_http_info(owner, repo, async_req=True)
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
                    " to method list_branches" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'owner' is set
        if ('owner' not in params or
                params['owner'] is None):
            raise ValueError("Missing the required parameter `owner` when calling `list_branches`")  # noqa: E501
        # verify the required parameter 'repo' is set
        if ('repo' not in params or
                params['repo'] is None):
            raise ValueError("Missing the required parameter `repo` when calling `list_branches`")  # noqa: E501

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
            '/repos/{owner}/{repo}/branches', 'GET',
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

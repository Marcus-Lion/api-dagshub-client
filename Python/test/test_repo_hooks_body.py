# coding: utf-8

"""
    DagsHub API

    This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training.   # noqa: E501

    OpenAPI spec version: 1.0.2
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import dagshub_api
from dagshub_api.models.repo_hooks_body import RepoHooksBody  # noqa: E501
from dagshub_api.rest import ApiException


class TestRepoHooksBody(unittest.TestCase):
    """RepoHooksBody unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testRepoHooksBody(self):
        """Test RepoHooksBody"""
        # FIXME: construct object with mandatory attributes with example values
        # model = dagshub_api.models.repo_hooks_body.RepoHooksBody()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
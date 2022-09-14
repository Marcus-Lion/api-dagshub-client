# coding: utf-8

"""
    DagsHub API

    The api docs are made with SwaggerUI using the OpenAPI 3 specification.   # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import dagshub-api
from dagshub-api.dagshub_api.commits_api import CommitsApi  # noqa: E501
from dagshub-api.rest import ApiException


class TestCommitsApi(unittest.TestCase):
    """CommitsApi unit test stubs"""

    def setUp(self):
        self.api = CommitsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_commit(self):
        """Test case for get_commit

        Get a single commit  # noqa: E501
        """
        pass

    def test_get_commit_sha1(self):
        """Test case for get_commit_sha1

        Get the SHA-1 of a commit reference  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()

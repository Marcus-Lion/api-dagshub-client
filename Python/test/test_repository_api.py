# coding: utf-8

"""
    DagsHub API

    This API is used to interact with DagsHub.   # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.dagshub_api.repository_api import RepositoryApi  # noqa: E501
from swagger_client.rest import ApiException


class TestRepositoryApi(unittest.TestCase):
    """RepositoryApi unit test stubs"""

    def setUp(self):
        self.api = RepositoryApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_org_repo(self):
        """Test case for create_org_repo

        Create in organization  # noqa: E501
        """
        pass

    def test_create_repo(self):
        """Test case for create_repo

        Create  # noqa: E501
        """
        pass

    def test_list_my_repos(self):
        """Test case for list_my_repos

        List your repositories  # noqa: E501
        """
        pass

    def test_list_org_repos(self):
        """Test case for list_org_repos

        List organization repositories  # noqa: E501
        """
        pass

    def test_list_user_repos(self):
        """Test case for list_user_repos

        List user repositories  # noqa: E501
        """
        pass

    def test_migrate_repo(self):
        """Test case for migrate_repo

        Migrate repository  # noqa: E501
        """
        pass

    def test_search(self):
        """Test case for search

        Search repositories  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
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
from dagshub-api.dagshub_api.releases_api import ReleasesApi  # noqa: E501
from dagshub-api.rest import ApiException


class TestReleasesApi(unittest.TestCase):
    """ReleasesApi unit test stubs"""

    def setUp(self):
        self.api = ReleasesApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_list_releases(self):
        """Test case for list_releases

        List Releases  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()

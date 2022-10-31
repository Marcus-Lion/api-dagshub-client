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
from dagshub_api.api.content_api import ContentApi  # noqa: E501
from dagshub_api.rest import ApiException


class TestContentApi(unittest.TestCase):
    """ContentApi unit test stubs"""

    def setUp(self):
        self.api = ContentApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_archive(self):
        """Test case for get_archive

        Download archive  # noqa: E501
        """
        pass

    def test_get_content(self):
        """Test case for get_content

        List data in a repository folder  # noqa: E501
        """
        pass

    def test_get_raw(self):
        """Test case for get_raw

        Download raw content  # noqa: E501
        """
        pass

    def test_upload_content(self):
        """Test case for upload_content

        Upload data to a repository  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()

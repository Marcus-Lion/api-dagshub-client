# coding: utf-8

"""
    DagsHub API

    This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training.   # noqa: E501

    OpenAPI spec version: 1.0.2
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class Files1(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'entries': 'list[File]',
        'limit': 'int',
        'next_token': 'str'
    }

    attribute_map = {
        'entries': 'entries',
        'limit': 'limit',
        'next_token': 'next_token'
    }

    def __init__(self, entries=None, limit=None, next_token=None):  # noqa: E501
        """Files1 - a model defined in Swagger"""  # noqa: E501
        self._entries = None
        self._limit = None
        self._next_token = None
        self.discriminator = None
        if entries is not None:
            self.entries = entries
        if limit is not None:
            self.limit = limit
        if next_token is not None:
            self.next_token = next_token

    @property
    def entries(self):
        """Gets the entries of this Files1.  # noqa: E501


        :return: The entries of this Files1.  # noqa: E501
        :rtype: list[File]
        """
        return self._entries

    @entries.setter
    def entries(self, entries):
        """Sets the entries of this Files1.


        :param entries: The entries of this Files1.  # noqa: E501
        :type: list[File]
        """

        self._entries = entries

    @property
    def limit(self):
        """Gets the limit of this Files1.  # noqa: E501


        :return: The limit of this Files1.  # noqa: E501
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """Sets the limit of this Files1.


        :param limit: The limit of this Files1.  # noqa: E501
        :type: int
        """

        self._limit = limit

    @property
    def next_token(self):
        """Gets the next_token of this Files1.  # noqa: E501


        :return: The next_token of this Files1.  # noqa: E501
        :rtype: str
        """
        return self._next_token

    @next_token.setter
    def next_token(self, next_token):
        """Sets the next_token of this Files1.


        :param next_token: The next_token of this Files1.  # noqa: E501
        :type: str
        """

        self._next_token = next_token

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(Files1, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Files1):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

# coding: utf-8

"""
    DagsHub API

    This API is used to interact with DagsHub.   # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class RepoHooksBody(object):
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
        'type': 'str',
        'config': 'WebhookConfig',
        'events': 'WebhookEvents'
    }

    attribute_map = {
        'type': 'type',
        'config': 'config',
        'events': 'events'
    }

    def __init__(self, type=None, config=None, events=None):  # noqa: E501
        """RepoHooksBody - a model defined in Swagger"""  # noqa: E501
        self._type = None
        self._config = None
        self._events = None
        self.discriminator = None
        self.type = type
        self.config = config
        if events is not None:
            self.events = events

    @property
    def type(self):
        """Gets the type of this RepoHooksBody.  # noqa: E501

        The type of webhook  # noqa: E501

        :return: The type of this RepoHooksBody.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this RepoHooksBody.

        The type of webhook  # noqa: E501

        :param type: The type of this RepoHooksBody.  # noqa: E501
        :type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501
        allowed_values = ["dagshub", "slack", "discord", "dingtalk"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def config(self):
        """Gets the config of this RepoHooksBody.  # noqa: E501


        :return: The config of this RepoHooksBody.  # noqa: E501
        :rtype: WebhookConfig
        """
        return self._config

    @config.setter
    def config(self, config):
        """Sets the config of this RepoHooksBody.


        :param config: The config of this RepoHooksBody.  # noqa: E501
        :type: WebhookConfig
        """
        if config is None:
            raise ValueError("Invalid value for `config`, must not be `None`")  # noqa: E501

        self._config = config

    @property
    def events(self):
        """Gets the events of this RepoHooksBody.  # noqa: E501


        :return: The events of this RepoHooksBody.  # noqa: E501
        :rtype: WebhookEvents
        """
        return self._events

    @events.setter
    def events(self, events):
        """Sets the events of this RepoHooksBody.


        :param events: The events of this RepoHooksBody.  # noqa: E501
        :type: WebhookEvents
        """

        self._events = events

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
        if issubclass(RepoHooksBody, dict):
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
        if not isinstance(other, RepoHooksBody):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other

/* 
 * DagsHub API
 *
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using dagshub_api.Client;
using dagshub_api.dagshub_api;

namespace dagshub_api.Test
{
    /// <summary>
    ///  Class for testing ReleasesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ReleasesApiTests
    {
        private ReleasesApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ReleasesApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ReleasesApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ReleasesApi
            //Assert.IsInstanceOfType(typeof(ReleasesApi), instance, "instance is a ReleasesApi");
        }

        /// <summary>
        /// Test ListReleases
        /// </summary>
        [Test]
        public void ListReleasesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string owner = null;
            //string repo = null;
            //instance.ListReleases(owner, repo);
            
        }
    }

}

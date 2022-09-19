/* 
 * DagsHub API
 *
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = dagshub_api.Client.SwaggerDateConverter;

namespace dagshub_api.Model
{
    /// <summary>
    /// Defines State
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
        public enum State
    {
        /// <summary>
        /// Enum Open for value: open
        /// </summary>
        [EnumMember(Value = "open")]
        Open = 1,
        /// <summary>
        /// Enum Closed for value: closed
        /// </summary>
        [EnumMember(Value = "closed")]
        Closed = 2    }
}

/* 
 * DagsHub API
 *
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
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
    /// Files1
    /// </summary>
    [DataContract]
        public partial class Files1 :  IEquatable<Files1>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Files1" /> class.
        /// </summary>
        /// <param name="entries">entries.</param>
        /// <param name="limit">limit.</param>
        /// <param name="nextToken">nextToken.</param>
        public Files1(List<System.IO.Stream> entries = default(List<System.IO.Stream>), int? limit = default(int?), string nextToken = default(string))
        {
            this.Entries = entries;
            this.Limit = limit;
            this.NextToken = nextToken;
        }
        
        /// <summary>
        /// Gets or Sets Entries
        /// </summary>
        [DataMember(Name="entries", EmitDefaultValue=false)]
        public List<System.IO.Stream> Entries { get; set; }

        /// <summary>
        /// Gets or Sets Limit
        /// </summary>
        [DataMember(Name="limit", EmitDefaultValue=false)]
        public int? Limit { get; set; }

        /// <summary>
        /// Gets or Sets NextToken
        /// </summary>
        [DataMember(Name="next_token", EmitDefaultValue=false)]
        public string NextToken { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Files1 {\n");
            sb.Append("  Entries: ").Append(Entries).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  NextToken: ").Append(NextToken).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Files1);
        }

        /// <summary>
        /// Returns true if Files1 instances are equal
        /// </summary>
        /// <param name="input">Instance of Files1 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Files1 input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Entries == input.Entries ||
                    this.Entries != null &&
                    input.Entries != null &&
                    this.Entries.SequenceEqual(input.Entries)
                ) && 
                (
                    this.Limit == input.Limit ||
                    (this.Limit != null &&
                    this.Limit.Equals(input.Limit))
                ) && 
                (
                    this.NextToken == input.NextToken ||
                    (this.NextToken != null &&
                    this.NextToken.Equals(input.NextToken))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Entries != null)
                    hashCode = hashCode * 59 + this.Entries.GetHashCode();
                if (this.Limit != null)
                    hashCode = hashCode * 59 + this.Limit.GetHashCode();
                if (this.NextToken != null)
                    hashCode = hashCode * 59 + this.NextToken.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
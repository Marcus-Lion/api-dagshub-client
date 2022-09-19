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
    /// PostIssue
    /// </summary>
    [DataContract]
        public partial class PostIssue :  IEquatable<PostIssue>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostIssue" /> class.
        /// </summary>
        /// <param name="title">title.</param>
        /// <param name="body">body.</param>
        /// <param name="assignee">assignee.</param>
        /// <param name="milestone">milestone.</param>
        /// <param name="labels">labels.</param>
        /// <param name="closed">closed.</param>
        public PostIssue(string title = default(string), string body = default(string), string assignee = default(string), int? milestone = default(int?), Labels labels = default(Labels), bool? closed = default(bool?))
        {
            this.Title = title;
            this.Body = body;
            this.Assignee = assignee;
            this.Milestone = milestone;
            this.Labels = labels;
            this.Closed = closed;
        }
        
        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Body
        /// </summary>
        [DataMember(Name="body", EmitDefaultValue=false)]
        public string Body { get; set; }

        /// <summary>
        /// Gets or Sets Assignee
        /// </summary>
        [DataMember(Name="assignee", EmitDefaultValue=false)]
        public string Assignee { get; set; }

        /// <summary>
        /// Gets or Sets Milestone
        /// </summary>
        [DataMember(Name="milestone", EmitDefaultValue=false)]
        public int? Milestone { get; set; }

        /// <summary>
        /// Gets or Sets Labels
        /// </summary>
        [DataMember(Name="labels", EmitDefaultValue=false)]
        public Labels Labels { get; set; }

        /// <summary>
        /// Gets or Sets Closed
        /// </summary>
        [DataMember(Name="closed", EmitDefaultValue=false)]
        public bool? Closed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PostIssue {\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
            sb.Append("  Assignee: ").Append(Assignee).Append("\n");
            sb.Append("  Milestone: ").Append(Milestone).Append("\n");
            sb.Append("  Labels: ").Append(Labels).Append("\n");
            sb.Append("  Closed: ").Append(Closed).Append("\n");
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
            return this.Equals(input as PostIssue);
        }

        /// <summary>
        /// Returns true if PostIssue instances are equal
        /// </summary>
        /// <param name="input">Instance of PostIssue to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostIssue input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Body == input.Body ||
                    (this.Body != null &&
                    this.Body.Equals(input.Body))
                ) && 
                (
                    this.Assignee == input.Assignee ||
                    (this.Assignee != null &&
                    this.Assignee.Equals(input.Assignee))
                ) && 
                (
                    this.Milestone == input.Milestone ||
                    (this.Milestone != null &&
                    this.Milestone.Equals(input.Milestone))
                ) && 
                (
                    this.Labels == input.Labels ||
                    (this.Labels != null &&
                    this.Labels.Equals(input.Labels))
                ) && 
                (
                    this.Closed == input.Closed ||
                    (this.Closed != null &&
                    this.Closed.Equals(input.Closed))
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
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.Body != null)
                    hashCode = hashCode * 59 + this.Body.GetHashCode();
                if (this.Assignee != null)
                    hashCode = hashCode * 59 + this.Assignee.GetHashCode();
                if (this.Milestone != null)
                    hashCode = hashCode * 59 + this.Milestone.GetHashCode();
                if (this.Labels != null)
                    hashCode = hashCode * 59 + this.Labels.GetHashCode();
                if (this.Closed != null)
                    hashCode = hashCode * 59 + this.Closed.GetHashCode();
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

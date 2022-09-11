/* 
 * DagsHub API
 *
 * This API is used to interact with DagsHub. 
 *
 * OpenAPI spec version: 1.0.0
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
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// IssueMilestone
    /// </summary>
    [DataContract]
        public partial class IssueMilestone :  IEquatable<IssueMilestone>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IssueMilestone" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="title">title.</param>
        /// <param name="description">description.</param>
        /// <param name="state">state.</param>
        /// <param name="openIssues">openIssues.</param>
        /// <param name="closedIssues">closedIssues.</param>
        /// <param name="closedAt">closedAt.</param>
        /// <param name="dueOn">dueOn.</param>
        public IssueMilestone(int? id = default(int?), string title = default(string), string description = default(string), string state = default(string), int? openIssues = default(int?), int? closedIssues = default(int?), string closedAt = default(string), string dueOn = default(string))
        {
            this.Id = id;
            this.Title = title;
            this.Description = description;
            this.State = state;
            this.OpenIssues = openIssues;
            this.ClosedIssues = closedIssues;
            this.ClosedAt = closedAt;
            this.DueOn = dueOn;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int? Id { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Gets or Sets OpenIssues
        /// </summary>
        [DataMember(Name="open_issues", EmitDefaultValue=false)]
        public int? OpenIssues { get; set; }

        /// <summary>
        /// Gets or Sets ClosedIssues
        /// </summary>
        [DataMember(Name="closed_issues", EmitDefaultValue=false)]
        public int? ClosedIssues { get; set; }

        /// <summary>
        /// Gets or Sets ClosedAt
        /// </summary>
        [DataMember(Name="closed_at", EmitDefaultValue=false)]
        public string ClosedAt { get; set; }

        /// <summary>
        /// Gets or Sets DueOn
        /// </summary>
        [DataMember(Name="due_on", EmitDefaultValue=false)]
        public string DueOn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IssueMilestone {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  OpenIssues: ").Append(OpenIssues).Append("\n");
            sb.Append("  ClosedIssues: ").Append(ClosedIssues).Append("\n");
            sb.Append("  ClosedAt: ").Append(ClosedAt).Append("\n");
            sb.Append("  DueOn: ").Append(DueOn).Append("\n");
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
            return this.Equals(input as IssueMilestone);
        }

        /// <summary>
        /// Returns true if IssueMilestone instances are equal
        /// </summary>
        /// <param name="input">Instance of IssueMilestone to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IssueMilestone input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.OpenIssues == input.OpenIssues ||
                    (this.OpenIssues != null &&
                    this.OpenIssues.Equals(input.OpenIssues))
                ) && 
                (
                    this.ClosedIssues == input.ClosedIssues ||
                    (this.ClosedIssues != null &&
                    this.ClosedIssues.Equals(input.ClosedIssues))
                ) && 
                (
                    this.ClosedAt == input.ClosedAt ||
                    (this.ClosedAt != null &&
                    this.ClosedAt.Equals(input.ClosedAt))
                ) && 
                (
                    this.DueOn == input.DueOn ||
                    (this.DueOn != null &&
                    this.DueOn.Equals(input.DueOn))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.State != null)
                    hashCode = hashCode * 59 + this.State.GetHashCode();
                if (this.OpenIssues != null)
                    hashCode = hashCode * 59 + this.OpenIssues.GetHashCode();
                if (this.ClosedIssues != null)
                    hashCode = hashCode * 59 + this.ClosedIssues.GetHashCode();
                if (this.ClosedAt != null)
                    hashCode = hashCode * 59 + this.ClosedAt.GetHashCode();
                if (this.DueOn != null)
                    hashCode = hashCode * 59 + this.DueOn.GetHashCode();
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

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
    /// Issue
    /// </summary>
    [DataContract]
        public partial class Issue :  IEquatable<Issue>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Issue" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="number">number.</param>
        /// <param name="user">user.</param>
        /// <param name="title">title (required).</param>
        /// <param name="body">body (required).</param>
        /// <param name="labels">labels (required).</param>
        /// <param name="milestone">milestone (required).</param>
        /// <param name="assignee">assignee (required).</param>
        /// <param name="state">state.</param>
        /// <param name="comments">comments.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="updatedAt">updatedAt.</param>
        /// <param name="pullRequest">pullRequest.</param>
        /// <param name="closed">closed (required).</param>
        public Issue(int? id = default(int?), int? number = default(int?), User user = default(User), string title = default(string), string body = default(string), List<IssueLabels> labels = default(List<IssueLabels>), IssueMilestone milestone = default(IssueMilestone), IssueAssignee assignee = default(IssueAssignee), string state = default(string), int? comments = default(int?), string createdAt = default(string), string updatedAt = default(string), Object pullRequest = default(Object), bool? closed = default(bool?))
        {
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new InvalidDataException("title is a required property for Issue and cannot be null");
            }
            else
            {
                this.Title = title;
            }
            // to ensure "body" is required (not null)
            if (body == null)
            {
                throw new InvalidDataException("body is a required property for Issue and cannot be null");
            }
            else
            {
                this.Body = body;
            }
            // to ensure "labels" is required (not null)
            if (labels == null)
            {
                throw new InvalidDataException("labels is a required property for Issue and cannot be null");
            }
            else
            {
                this.Labels = labels;
            }
            // to ensure "milestone" is required (not null)
            if (milestone == null)
            {
                throw new InvalidDataException("milestone is a required property for Issue and cannot be null");
            }
            else
            {
                this.Milestone = milestone;
            }
            // to ensure "assignee" is required (not null)
            if (assignee == null)
            {
                throw new InvalidDataException("assignee is a required property for Issue and cannot be null");
            }
            else
            {
                this.Assignee = assignee;
            }
            // to ensure "closed" is required (not null)
            if (closed == null)
            {
                throw new InvalidDataException("closed is a required property for Issue and cannot be null");
            }
            else
            {
                this.Closed = closed;
            }
            this.Id = id;
            this.Number = number;
            this.User = user;
            this.State = state;
            this.Comments = comments;
            this.CreatedAt = createdAt;
            this.UpdatedAt = updatedAt;
            this.PullRequest = pullRequest;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public int? Id { get; set; }

        /// <summary>
        /// Gets or Sets Number
        /// </summary>
        [DataMember(Name="number", EmitDefaultValue=false)]
        public int? Number { get; set; }

        /// <summary>
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name="user", EmitDefaultValue=false)]
        public User User { get; set; }

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
        /// Gets or Sets Labels
        /// </summary>
        [DataMember(Name="labels", EmitDefaultValue=false)]
        public List<IssueLabels> Labels { get; set; }

        /// <summary>
        /// Gets or Sets Milestone
        /// </summary>
        [DataMember(Name="milestone", EmitDefaultValue=false)]
        public IssueMilestone Milestone { get; set; }

        /// <summary>
        /// Gets or Sets Assignee
        /// </summary>
        [DataMember(Name="assignee", EmitDefaultValue=false)]
        public IssueAssignee Assignee { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public string State { get; set; }

        /// <summary>
        /// Gets or Sets Comments
        /// </summary>
        [DataMember(Name="comments", EmitDefaultValue=false)]
        public int? Comments { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name="created_at", EmitDefaultValue=false)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>
        [DataMember(Name="updated_at", EmitDefaultValue=false)]
        public string UpdatedAt { get; set; }

        /// <summary>
        /// Gets or Sets PullRequest
        /// </summary>
        [DataMember(Name="pull_request", EmitDefaultValue=false)]
        public Object PullRequest { get; set; }

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
            sb.Append("class Issue {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
            sb.Append("  Labels: ").Append(Labels).Append("\n");
            sb.Append("  Milestone: ").Append(Milestone).Append("\n");
            sb.Append("  Assignee: ").Append(Assignee).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Comments: ").Append(Comments).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  PullRequest: ").Append(PullRequest).Append("\n");
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
            return this.Equals(input as Issue);
        }

        /// <summary>
        /// Returns true if Issue instances are equal
        /// </summary>
        /// <param name="input">Instance of Issue to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Issue input)
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
                    this.Number == input.Number ||
                    (this.Number != null &&
                    this.Number.Equals(input.Number))
                ) && 
                (
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                ) && 
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
                    this.Labels == input.Labels ||
                    this.Labels != null &&
                    input.Labels != null &&
                    this.Labels.SequenceEqual(input.Labels)
                ) && 
                (
                    this.Milestone == input.Milestone ||
                    (this.Milestone != null &&
                    this.Milestone.Equals(input.Milestone))
                ) && 
                (
                    this.Assignee == input.Assignee ||
                    (this.Assignee != null &&
                    this.Assignee.Equals(input.Assignee))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.Comments == input.Comments ||
                    (this.Comments != null &&
                    this.Comments.Equals(input.Comments))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.UpdatedAt == input.UpdatedAt ||
                    (this.UpdatedAt != null &&
                    this.UpdatedAt.Equals(input.UpdatedAt))
                ) && 
                (
                    this.PullRequest == input.PullRequest ||
                    (this.PullRequest != null &&
                    this.PullRequest.Equals(input.PullRequest))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Number != null)
                    hashCode = hashCode * 59 + this.Number.GetHashCode();
                if (this.User != null)
                    hashCode = hashCode * 59 + this.User.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.Body != null)
                    hashCode = hashCode * 59 + this.Body.GetHashCode();
                if (this.Labels != null)
                    hashCode = hashCode * 59 + this.Labels.GetHashCode();
                if (this.Milestone != null)
                    hashCode = hashCode * 59 + this.Milestone.GetHashCode();
                if (this.Assignee != null)
                    hashCode = hashCode * 59 + this.Assignee.GetHashCode();
                if (this.State != null)
                    hashCode = hashCode * 59 + this.State.GetHashCode();
                if (this.Comments != null)
                    hashCode = hashCode * 59 + this.Comments.GetHashCode();
                if (this.CreatedAt != null)
                    hashCode = hashCode * 59 + this.CreatedAt.GetHashCode();
                if (this.UpdatedAt != null)
                    hashCode = hashCode * 59 + this.UpdatedAt.GetHashCode();
                if (this.PullRequest != null)
                    hashCode = hashCode * 59 + this.PullRequest.GetHashCode();
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

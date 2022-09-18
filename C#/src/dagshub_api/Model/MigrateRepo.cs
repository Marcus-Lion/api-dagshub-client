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
    /// MigrateRepo
    /// </summary>
    [DataContract]
        public partial class MigrateRepo :  IEquatable<MigrateRepo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MigrateRepo" /> class.
        /// </summary>
        /// <param name="cloneAddr">Remote Git address (HTTP/HTTPS URL or local path) (required).</param>
        /// <param name="authUsername">Authorization username.</param>
        /// <param name="authPassword">Authorization password.</param>
        /// <param name="uid">User ID who takes ownership of this repository (required).</param>
        /// <param name="repoName">Name of the repository.</param>
        /// <param name="mirror">Repository will be a mirror (connected repository). (default to false).</param>
        /// <param name="_private">Repository will be private. (default to false).</param>
        /// <param name="description">Description of the repository.</param>
        public MigrateRepo(string cloneAddr = default(string), string authUsername = default(string), string authPassword = default(string), int? uid = default(int?), string repoName = default(string), bool? mirror = false, bool? _private = false, string description = default(string))
        {
            // to ensure "cloneAddr" is required (not null)
            if (cloneAddr == null)
            {
                throw new InvalidDataException("cloneAddr is a required property for MigrateRepo and cannot be null");
            }
            else
            {
                this.CloneAddr = cloneAddr;
            }
            // to ensure "uid" is required (not null)
            if (uid == null)
            {
                throw new InvalidDataException("uid is a required property for MigrateRepo and cannot be null");
            }
            else
            {
                this.Uid = uid;
            }
            this.AuthUsername = authUsername;
            this.AuthPassword = authPassword;
            this.RepoName = repoName;
            // use default value if no "mirror" provided
            if (mirror == null)
            {
                this.Mirror = false;
            }
            else
            {
                this.Mirror = mirror;
            }
            // use default value if no "_private" provided
            if (_private == null)
            {
                this._Private = false;
            }
            else
            {
                this._Private = _private;
            }
            this.Description = description;
        }
        
        /// <summary>
        /// Remote Git address (HTTP/HTTPS URL or local path)
        /// </summary>
        /// <value>Remote Git address (HTTP/HTTPS URL or local path)</value>
        [DataMember(Name="clone_addr", EmitDefaultValue=false)]
        public string CloneAddr { get; set; }

        /// <summary>
        /// Authorization username
        /// </summary>
        /// <value>Authorization username</value>
        [DataMember(Name="auth_username", EmitDefaultValue=false)]
        public string AuthUsername { get; set; }

        /// <summary>
        /// Authorization password
        /// </summary>
        /// <value>Authorization password</value>
        [DataMember(Name="auth_password", EmitDefaultValue=false)]
        public string AuthPassword { get; set; }

        /// <summary>
        /// User ID who takes ownership of this repository
        /// </summary>
        /// <value>User ID who takes ownership of this repository</value>
        [DataMember(Name="uid", EmitDefaultValue=false)]
        public int? Uid { get; set; }

        /// <summary>
        /// Name of the repository
        /// </summary>
        /// <value>Name of the repository</value>
        [DataMember(Name="repo_name", EmitDefaultValue=false)]
        public string RepoName { get; set; }

        /// <summary>
        /// Repository will be a mirror (connected repository).
        /// </summary>
        /// <value>Repository will be a mirror (connected repository).</value>
        [DataMember(Name="mirror", EmitDefaultValue=false)]
        public bool? Mirror { get; set; }

        /// <summary>
        /// Repository will be private.
        /// </summary>
        /// <value>Repository will be private.</value>
        [DataMember(Name="private", EmitDefaultValue=false)]
        public bool? _Private { get; set; }

        /// <summary>
        /// Description of the repository
        /// </summary>
        /// <value>Description of the repository</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MigrateRepo {\n");
            sb.Append("  CloneAddr: ").Append(CloneAddr).Append("\n");
            sb.Append("  AuthUsername: ").Append(AuthUsername).Append("\n");
            sb.Append("  AuthPassword: ").Append(AuthPassword).Append("\n");
            sb.Append("  Uid: ").Append(Uid).Append("\n");
            sb.Append("  RepoName: ").Append(RepoName).Append("\n");
            sb.Append("  Mirror: ").Append(Mirror).Append("\n");
            sb.Append("  _Private: ").Append(_Private).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
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
            return this.Equals(input as MigrateRepo);
        }

        /// <summary>
        /// Returns true if MigrateRepo instances are equal
        /// </summary>
        /// <param name="input">Instance of MigrateRepo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MigrateRepo input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CloneAddr == input.CloneAddr ||
                    (this.CloneAddr != null &&
                    this.CloneAddr.Equals(input.CloneAddr))
                ) && 
                (
                    this.AuthUsername == input.AuthUsername ||
                    (this.AuthUsername != null &&
                    this.AuthUsername.Equals(input.AuthUsername))
                ) && 
                (
                    this.AuthPassword == input.AuthPassword ||
                    (this.AuthPassword != null &&
                    this.AuthPassword.Equals(input.AuthPassword))
                ) && 
                (
                    this.Uid == input.Uid ||
                    (this.Uid != null &&
                    this.Uid.Equals(input.Uid))
                ) && 
                (
                    this.RepoName == input.RepoName ||
                    (this.RepoName != null &&
                    this.RepoName.Equals(input.RepoName))
                ) && 
                (
                    this.Mirror == input.Mirror ||
                    (this.Mirror != null &&
                    this.Mirror.Equals(input.Mirror))
                ) && 
                (
                    this._Private == input._Private ||
                    (this._Private != null &&
                    this._Private.Equals(input._Private))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
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
                if (this.CloneAddr != null)
                    hashCode = hashCode * 59 + this.CloneAddr.GetHashCode();
                if (this.AuthUsername != null)
                    hashCode = hashCode * 59 + this.AuthUsername.GetHashCode();
                if (this.AuthPassword != null)
                    hashCode = hashCode * 59 + this.AuthPassword.GetHashCode();
                if (this.Uid != null)
                    hashCode = hashCode * 59 + this.Uid.GetHashCode();
                if (this.RepoName != null)
                    hashCode = hashCode * 59 + this.RepoName.GetHashCode();
                if (this.Mirror != null)
                    hashCode = hashCode * 59 + this.Mirror.GetHashCode();
                if (this._Private != null)
                    hashCode = hashCode * 59 + this._Private.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
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

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
    /// RepoHooksBody
    /// </summary>
    [DataContract]
        public partial class RepoHooksBody :  IEquatable<RepoHooksBody>, IValidatableObject
    {
        /// <summary>
        /// The type of webhook
        /// </summary>
        /// <value>The type of webhook</value>
        [JsonConverter(typeof(StringEnumConverter))]
                public enum TypeEnum
        {
            /// <summary>
            /// Enum Dagshub for value: dagshub
            /// </summary>
            [EnumMember(Value = "dagshub")]
            Dagshub = 1,
            /// <summary>
            /// Enum Slack for value: slack
            /// </summary>
            [EnumMember(Value = "slack")]
            Slack = 2,
            /// <summary>
            /// Enum Discord for value: discord
            /// </summary>
            [EnumMember(Value = "discord")]
            Discord = 3,
            /// <summary>
            /// Enum Dingtalk for value: dingtalk
            /// </summary>
            [EnumMember(Value = "dingtalk")]
            Dingtalk = 4        }
        /// <summary>
        /// The type of webhook
        /// </summary>
        /// <value>The type of webhook</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RepoHooksBody" /> class.
        /// </summary>
        /// <param name="type">The type of webhook (required).</param>
        /// <param name="config">config (required).</param>
        /// <param name="events">events.</param>
        public RepoHooksBody(TypeEnum type = default(TypeEnum), WebhookConfig config = default(WebhookConfig), WebhookEvents events = default(WebhookEvents))
        {
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new InvalidDataException("type is a required property for RepoHooksBody and cannot be null");
            }
            else
            {
                this.Type = type;
            }
            // to ensure "config" is required (not null)
            if (config == null)
            {
                throw new InvalidDataException("config is a required property for RepoHooksBody and cannot be null");
            }
            else
            {
                this.Config = config;
            }
            this.Events = events;
        }
        

        /// <summary>
        /// Gets or Sets Config
        /// </summary>
        [DataMember(Name="config", EmitDefaultValue=false)]
        public WebhookConfig Config { get; set; }

        /// <summary>
        /// Gets or Sets Events
        /// </summary>
        [DataMember(Name="events", EmitDefaultValue=false)]
        public WebhookEvents Events { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RepoHooksBody {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Config: ").Append(Config).Append("\n");
            sb.Append("  Events: ").Append(Events).Append("\n");
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
            return this.Equals(input as RepoHooksBody);
        }

        /// <summary>
        /// Returns true if RepoHooksBody instances are equal
        /// </summary>
        /// <param name="input">Instance of RepoHooksBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RepoHooksBody input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Config == input.Config ||
                    (this.Config != null &&
                    this.Config.Equals(input.Config))
                ) && 
                (
                    this.Events == input.Events ||
                    (this.Events != null &&
                    this.Events.Equals(input.Events))
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
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Config != null)
                    hashCode = hashCode * 59 + this.Config.GetHashCode();
                if (this.Events != null)
                    hashCode = hashCode * 59 + this.Events.GetHashCode();
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

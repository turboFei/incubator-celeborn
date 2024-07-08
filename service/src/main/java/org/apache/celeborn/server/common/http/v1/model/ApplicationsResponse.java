/*
 * Celeborn REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.celeborn.server.common.http.v1.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.server.common.http.v1.JSON;


/**
 * ApplicationsResponse
 */
@JsonPropertyOrder({
  ApplicationsResponse.JSON_PROPERTY_APPLICATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApplicationsResponse {
  public static final String JSON_PROPERTY_APPLICATIONS = "applications";
  private List<String> applications = null;

  public ApplicationsResponse() { 
  }

  public ApplicationsResponse applications(List<String> applications) {
    this.applications = applications;
    return this;
  }

  public ApplicationsResponse addApplicationsItem(String applicationsItem) {
    if (this.applications == null) {
      this.applications = null;
    }
    this.applications.add(applicationsItem);
    return this;
  }

   /**
   * The applications information.
   * @return applications
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The applications information.")
  @JsonProperty(JSON_PROPERTY_APPLICATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getApplications() {
    return applications;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApplications(List<String> applications) {
    this.applications = applications;
  }


  /**
   * Return true if this ApplicationsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationsResponse applicationsResponse = (ApplicationsResponse) o;
    return Objects.equals(this.applications, applicationsResponse.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationsResponse {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


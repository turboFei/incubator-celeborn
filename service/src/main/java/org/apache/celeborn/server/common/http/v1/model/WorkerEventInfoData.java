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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.server.common.http.v1.JSON;


/**
 * WorkerEventInfoData
 */
@JsonPropertyOrder({
  WorkerEventInfoData.JSON_PROPERTY_EVENT_TYPE,
  WorkerEventInfoData.JSON_PROPERTY_EVENT_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkerEventInfoData {
  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private String eventType;

  public static final String JSON_PROPERTY_EVENT_TIME = "eventTime";
  private Long eventTime;

  public WorkerEventInfoData() { 
  }

  public WorkerEventInfoData eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the event.
   * @return eventType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the event.")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public WorkerEventInfoData eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * The start time of the event.
   * @return eventTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The start time of the event.")
  @JsonProperty(JSON_PROPERTY_EVENT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getEventTime() {
    return eventTime;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }


  /**
   * Return true if this WorkerEventInfoData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerEventInfoData workerEventInfoData = (WorkerEventInfoData) o;
    return Objects.equals(this.eventType, workerEventInfoData.eventType) &&
        Objects.equals(this.eventTime, workerEventInfoData.eventTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, eventTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerEventInfoData {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
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


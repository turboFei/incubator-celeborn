/*
 * Celeborn Worker REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.celeborn.rest.v1.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.celeborn.rest.v1.model.WorkerData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.rest.v1.worker.invoker.JSON;


/**
 * WorkerTimestampData
 */
@JsonPropertyOrder({
  WorkerTimestampData.JSON_PROPERTY_WORKER,
  WorkerTimestampData.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-03T00:05:36.177317-07:00[America/Los_Angeles]")
public class WorkerTimestampData {
  public static final String JSON_PROPERTY_WORKER = "worker";
  private WorkerData worker;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public WorkerTimestampData() { 
  }

  public WorkerTimestampData worker(WorkerData worker) {
    this.worker = worker;
    return this;
  }

   /**
   * Get worker
   * @return worker
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WORKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WorkerData getWorker() {
    return worker;
  }


  @JsonProperty(JSON_PROPERTY_WORKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorker(WorkerData worker) {
    this.worker = worker;
  }


  public WorkerTimestampData timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * Return true if this WorkerTimestampData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerTimestampData workerTimestampData = (WorkerTimestampData) o;
    return Objects.equals(this.worker, workerTimestampData.worker) &&
        Objects.equals(this.timestamp, workerTimestampData.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worker, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerTimestampData {\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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


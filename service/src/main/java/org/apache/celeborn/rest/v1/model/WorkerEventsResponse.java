/*
 * Celeborn Master REST API
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
import java.util.ArrayList;
import java.util.List;
import org.apache.celeborn.rest.v1.model.WorkerEventData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.rest.v1.master.invoker.JSON;


/**
 * WorkerEventsResponse
 */
@JsonPropertyOrder({
  WorkerEventsResponse.JSON_PROPERTY_WORKER_EVENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-03T00:05:35.703792-07:00[America/Los_Angeles]")
public class WorkerEventsResponse {
  public static final String JSON_PROPERTY_WORKER_EVENTS = "workerEvents";
  private List<WorkerEventData> workerEvents = null;

  public WorkerEventsResponse() { 
  }

  public WorkerEventsResponse workerEvents(List<WorkerEventData> workerEvents) {
    this.workerEvents = workerEvents;
    return this;
  }

  public WorkerEventsResponse addWorkerEventsItem(WorkerEventData workerEventsItem) {
    if (this.workerEvents == null) {
      this.workerEvents = null;
    }
    this.workerEvents.add(workerEventsItem);
    return this;
  }

   /**
   * The worker events.
   * @return workerEvents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKER_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WorkerEventData> getWorkerEvents() {
    return workerEvents;
  }


  @JsonProperty(JSON_PROPERTY_WORKER_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkerEvents(List<WorkerEventData> workerEvents) {
    this.workerEvents = workerEvents;
  }


  /**
   * Return true if this WorkerEventsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerEventsResponse workerEventsResponse = (WorkerEventsResponse) o;
    return Objects.equals(this.workerEvents, workerEventsResponse.workerEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerEventsResponse {\n");
    sb.append("    workerEvents: ").append(toIndentedString(workerEvents)).append("\n");
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


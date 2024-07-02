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
import java.util.ArrayList;
import java.util.List;
import org.apache.celeborn.server.common.http.v1.model.WorkerId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.server.common.http.v1.JSON;


/**
 * SendWorkerEventRequest
 */
@JsonPropertyOrder({
  SendWorkerEventRequest.JSON_PROPERTY_EVENT_TYPE,
  SendWorkerEventRequest.JSON_PROPERTY_WORKERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SendWorkerEventRequest {
  /**
   * The type of the event.
   */
  public enum EventTypeEnum {
    IMMEDIATELY("Immediately"),
    
    DECOMMISSION("Decommission"),
    
    DECOMMISSIONTHENIDLE("DecommissionThenIdle"),
    
    GRACEFUL("Graceful"),
    
    RECOMMISSION("Recommission"),
    
    NONE("None");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private EventTypeEnum eventType = EventTypeEnum.NONE;

  public static final String JSON_PROPERTY_WORKERS = "workers";
  private List<WorkerId> workers = null;

  public SendWorkerEventRequest() { 
  }

  public SendWorkerEventRequest eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the event.
   * @return eventType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventTypeEnum getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }


  public SendWorkerEventRequest workers(List<WorkerId> workers) {
    this.workers = workers;
    return this;
  }

  public SendWorkerEventRequest addWorkersItem(WorkerId workersItem) {
    if (this.workers == null) {
      this.workers = null;
    }
    this.workers.add(workersItem);
    return this;
  }

   /**
   * The workers to send the event.
   * @return workers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WorkerId> getWorkers() {
    return workers;
  }


  @JsonProperty(JSON_PROPERTY_WORKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkers(List<WorkerId> workers) {
    this.workers = workers;
  }


  /**
   * Return true if this SendWorkerEventRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendWorkerEventRequest sendWorkerEventRequest = (SendWorkerEventRequest) o;
    return Objects.equals(this.eventType, sendWorkerEventRequest.eventType) &&
        Objects.equals(this.workers, sendWorkerEventRequest.workers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, workers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendWorkerEventRequest {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    workers: ").append(toIndentedString(workers)).append("\n");
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


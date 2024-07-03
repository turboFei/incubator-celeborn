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
import java.util.ArrayList;
import java.util.List;
import org.apache.celeborn.rest.v1.model.WorkerTimestampData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.rest.v1.worker.invoker.JSON;


/**
 * UnAvailablePeersResponse
 */
@JsonPropertyOrder({
  UnAvailablePeersResponse.JSON_PROPERTY_PEERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-03T00:05:36.177317-07:00[America/Los_Angeles]")
public class UnAvailablePeersResponse {
  public static final String JSON_PROPERTY_PEERS = "peers";
  private List<WorkerTimestampData> peers = null;

  public UnAvailablePeersResponse() { 
  }

  public UnAvailablePeersResponse peers(List<WorkerTimestampData> peers) {
    this.peers = peers;
    return this;
  }

  public UnAvailablePeersResponse addPeersItem(WorkerTimestampData peersItem) {
    if (this.peers == null) {
      this.peers = null;
    }
    this.peers.add(peersItem);
    return this;
  }

   /**
   * The unavailable peers.
   * @return peers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PEERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WorkerTimestampData> getPeers() {
    return peers;
  }


  @JsonProperty(JSON_PROPERTY_PEERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeers(List<WorkerTimestampData> peers) {
    this.peers = peers;
  }


  /**
   * Return true if this UnAvailablePeersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnAvailablePeersResponse unAvailablePeersResponse = (UnAvailablePeersResponse) o;
    return Objects.equals(this.peers, unAvailablePeersResponse.peers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(peers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnAvailablePeersResponse {\n");
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
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


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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.server.common.http.v1.JSON;


/**
 * MasterCommitData
 */
@JsonPropertyOrder({
  MasterCommitData.JSON_PROPERTY_COMMIT_INDEX,
  MasterCommitData.JSON_PROPERTY_ID,
  MasterCommitData.JSON_PROPERTY_ADDRESS,
  MasterCommitData.JSON_PROPERTY_CLIENT_ADDRESS,
  MasterCommitData.JSON_PROPERTY_START_UP_ROLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MasterCommitData {
  public static final String JSON_PROPERTY_COMMIT_INDEX = "commitIndex";
  private Long commitIndex;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_CLIENT_ADDRESS = "clientAddress";
  private String clientAddress;

  public static final String JSON_PROPERTY_START_UP_ROLE = "startUpRole";
  private String startUpRole;

  public MasterCommitData() { 
  }

  public MasterCommitData commitIndex(Long commitIndex) {
    this.commitIndex = commitIndex;
    return this;
  }

   /**
   * The raft commit index of the master.
   * @return commitIndex
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMIT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCommitIndex() {
    return commitIndex;
  }


  @JsonProperty(JSON_PROPERTY_COMMIT_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommitIndex(Long commitIndex) {
    this.commitIndex = commitIndex;
  }


  public MasterCommitData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the raft peer.
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public MasterCommitData address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The raft RPC address of the peer for server-server communication.
   * @return address
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(String address) {
    this.address = address;
  }


  public MasterCommitData clientAddress(String clientAddress) {
    this.clientAddress = clientAddress;
    return this;
  }

   /**
   * The raft RPC address of the peer for client operations.
   * @return clientAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientAddress() {
    return clientAddress;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientAddress(String clientAddress) {
    this.clientAddress = clientAddress;
  }


  public MasterCommitData startUpRole(String startUpRole) {
    this.startUpRole = startUpRole;
    return this;
  }

   /**
   * The raft start up role of the master.
   * @return startUpRole
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_UP_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartUpRole() {
    return startUpRole;
  }


  @JsonProperty(JSON_PROPERTY_START_UP_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartUpRole(String startUpRole) {
    this.startUpRole = startUpRole;
  }


  /**
   * Return true if this MasterCommitData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterCommitData masterCommitData = (MasterCommitData) o;
    return Objects.equals(this.commitIndex, masterCommitData.commitIndex) &&
        Objects.equals(this.id, masterCommitData.id) &&
        Objects.equals(this.address, masterCommitData.address) &&
        Objects.equals(this.clientAddress, masterCommitData.clientAddress) &&
        Objects.equals(this.startUpRole, masterCommitData.startUpRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitIndex, id, address, clientAddress, startUpRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterCommitData {\n");
    sb.append("    commitIndex: ").append(toIndentedString(commitIndex)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    clientAddress: ").append(toIndentedString(clientAddress)).append("\n");
    sb.append("    startUpRole: ").append(toIndentedString(startUpRole)).append("\n");
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


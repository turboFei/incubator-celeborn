/*
 * Celeborn Master REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: user@celeborn.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.celeborn.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.celeborn.client.JSON;

/**
 * WorkerId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class WorkerId {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_RPC_PORT = "rpcPort";
  @SerializedName(SERIALIZED_NAME_RPC_PORT)
  private Integer rpcPort;

  public static final String SERIALIZED_NAME_PUSH_PORT = "pushPort";
  @SerializedName(SERIALIZED_NAME_PUSH_PORT)
  private Integer pushPort;

  public static final String SERIALIZED_NAME_FETCH_PORT = "fetchPort";
  @SerializedName(SERIALIZED_NAME_FETCH_PORT)
  private Integer fetchPort;

  public static final String SERIALIZED_NAME_REPLICATE_PORT = "replicatePort";
  @SerializedName(SERIALIZED_NAME_REPLICATE_PORT)
  private Integer replicatePort;

  public WorkerId() {
  }

  public WorkerId host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The host of the worker.
   * @return host
  **/
  @javax.annotation.Nonnull
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public WorkerId rpcPort(Integer rpcPort) {
    this.rpcPort = rpcPort;
    return this;
  }

   /**
   * The rpc port of the worker.
   * @return rpcPort
  **/
  @javax.annotation.Nonnull
  public Integer getRpcPort() {
    return rpcPort;
  }

  public void setRpcPort(Integer rpcPort) {
    this.rpcPort = rpcPort;
  }


  public WorkerId pushPort(Integer pushPort) {
    this.pushPort = pushPort;
    return this;
  }

   /**
   * The push port of the worker.
   * @return pushPort
  **/
  @javax.annotation.Nonnull
  public Integer getPushPort() {
    return pushPort;
  }

  public void setPushPort(Integer pushPort) {
    this.pushPort = pushPort;
  }


  public WorkerId fetchPort(Integer fetchPort) {
    this.fetchPort = fetchPort;
    return this;
  }

   /**
   * The fetch port of the worker.
   * @return fetchPort
  **/
  @javax.annotation.Nonnull
  public Integer getFetchPort() {
    return fetchPort;
  }

  public void setFetchPort(Integer fetchPort) {
    this.fetchPort = fetchPort;
  }


  public WorkerId replicatePort(Integer replicatePort) {
    this.replicatePort = replicatePort;
    return this;
  }

   /**
   * The replicate port of the worker.
   * @return replicatePort
  **/
  @javax.annotation.Nonnull
  public Integer getReplicatePort() {
    return replicatePort;
  }

  public void setReplicatePort(Integer replicatePort) {
    this.replicatePort = replicatePort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerId workerId = (WorkerId) o;
    return Objects.equals(this.host, workerId.host) &&
        Objects.equals(this.rpcPort, workerId.rpcPort) &&
        Objects.equals(this.pushPort, workerId.pushPort) &&
        Objects.equals(this.fetchPort, workerId.fetchPort) &&
        Objects.equals(this.replicatePort, workerId.replicatePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, rpcPort, pushPort, fetchPort, replicatePort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerId {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    rpcPort: ").append(toIndentedString(rpcPort)).append("\n");
    sb.append("    pushPort: ").append(toIndentedString(pushPort)).append("\n");
    sb.append("    fetchPort: ").append(toIndentedString(fetchPort)).append("\n");
    sb.append("    replicatePort: ").append(toIndentedString(replicatePort)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("host");
    openapiFields.add("rpcPort");
    openapiFields.add("pushPort");
    openapiFields.add("fetchPort");
    openapiFields.add("replicatePort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("host");
    openapiRequiredFields.add("rpcPort");
    openapiRequiredFields.add("pushPort");
    openapiRequiredFields.add("fetchPort");
    openapiRequiredFields.add("replicatePort");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WorkerId
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WorkerId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkerId is not found in the empty JSON string", WorkerId.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WorkerId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkerId` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkerId.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkerId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkerId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkerId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkerId.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkerId>() {
           @Override
           public void write(JsonWriter out, WorkerId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkerId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkerId given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkerId
  * @throws IOException if the JSON string is invalid with respect to WorkerId
  */
  public static WorkerId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkerId.class);
  }

 /**
  * Convert an instance of WorkerId to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

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
 * PartitionLocationData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class PartitionLocationData {
  public static final String SERIALIZED_NAME_ID_EPOCH = "idEpoch";
  @SerializedName(SERIALIZED_NAME_ID_EPOCH)
  private Long idEpoch;

  public static final String SERIALIZED_NAME_HOST_AND_PORTS = "hostAndPorts";
  @SerializedName(SERIALIZED_NAME_HOST_AND_PORTS)
  private String hostAndPorts;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_PEER = "peer";
  @SerializedName(SERIALIZED_NAME_PEER)
  private String peer;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private String storage;

  public static final String SERIALIZED_NAME_MAP_ID_BIT_MAP = "mapIdBitMap";
  @SerializedName(SERIALIZED_NAME_MAP_ID_BIT_MAP)
  private String mapIdBitMap;

  public PartitionLocationData() {
  }

  public PartitionLocationData idEpoch(Long idEpoch) {
    this.idEpoch = idEpoch;
    return this;
  }

   /**
   * The id and epoch.
   * @return idEpoch
  **/
  @javax.annotation.Nonnull
  public Long getIdEpoch() {
    return idEpoch;
  }

  public void setIdEpoch(Long idEpoch) {
    this.idEpoch = idEpoch;
  }


  public PartitionLocationData hostAndPorts(String hostAndPorts) {
    this.hostAndPorts = hostAndPorts;
    return this;
  }

   /**
   * The host and ports.
   * @return hostAndPorts
  **/
  @javax.annotation.Nonnull
  public String getHostAndPorts() {
    return hostAndPorts;
  }

  public void setHostAndPorts(String hostAndPorts) {
    this.hostAndPorts = hostAndPorts;
  }


  public PartitionLocationData mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * The mode of the partition location data.
   * @return mode
  **/
  @javax.annotation.Nonnull
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  public PartitionLocationData peer(String peer) {
    this.peer = peer;
    return this;
  }

   /**
   * The peer of the partition location data.
   * @return peer
  **/
  @javax.annotation.Nonnull
  public String getPeer() {
    return peer;
  }

  public void setPeer(String peer) {
    this.peer = peer;
  }


  public PartitionLocationData storage(String storage) {
    this.storage = storage;
    return this;
  }

   /**
   * The storage of the partition location data.
   * @return storage
  **/
  @javax.annotation.Nonnull
  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }


  public PartitionLocationData mapIdBitMap(String mapIdBitMap) {
    this.mapIdBitMap = mapIdBitMap;
    return this;
  }

   /**
   * The map id bitmap of the partition location data.
   * @return mapIdBitMap
  **/
  @javax.annotation.Nonnull
  public String getMapIdBitMap() {
    return mapIdBitMap;
  }

  public void setMapIdBitMap(String mapIdBitMap) {
    this.mapIdBitMap = mapIdBitMap;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartitionLocationData partitionLocationData = (PartitionLocationData) o;
    return Objects.equals(this.idEpoch, partitionLocationData.idEpoch) &&
        Objects.equals(this.hostAndPorts, partitionLocationData.hostAndPorts) &&
        Objects.equals(this.mode, partitionLocationData.mode) &&
        Objects.equals(this.peer, partitionLocationData.peer) &&
        Objects.equals(this.storage, partitionLocationData.storage) &&
        Objects.equals(this.mapIdBitMap, partitionLocationData.mapIdBitMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEpoch, hostAndPorts, mode, peer, storage, mapIdBitMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartitionLocationData {\n");
    sb.append("    idEpoch: ").append(toIndentedString(idEpoch)).append("\n");
    sb.append("    hostAndPorts: ").append(toIndentedString(hostAndPorts)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    mapIdBitMap: ").append(toIndentedString(mapIdBitMap)).append("\n");
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
    openapiFields.add("idEpoch");
    openapiFields.add("hostAndPorts");
    openapiFields.add("mode");
    openapiFields.add("peer");
    openapiFields.add("storage");
    openapiFields.add("mapIdBitMap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("idEpoch");
    openapiRequiredFields.add("hostAndPorts");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("peer");
    openapiRequiredFields.add("storage");
    openapiRequiredFields.add("mapIdBitMap");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PartitionLocationData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PartitionLocationData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartitionLocationData is not found in the empty JSON string", PartitionLocationData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PartitionLocationData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartitionLocationData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PartitionLocationData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("hostAndPorts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostAndPorts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostAndPorts").toString()));
      }
      if (!jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      if (!jsonObj.get("peer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `peer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("peer").toString()));
      }
      if (!jsonObj.get("storage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storage").toString()));
      }
      if (!jsonObj.get("mapIdBitMap").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mapIdBitMap` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mapIdBitMap").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartitionLocationData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartitionLocationData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartitionLocationData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartitionLocationData.class));

       return (TypeAdapter<T>) new TypeAdapter<PartitionLocationData>() {
           @Override
           public void write(JsonWriter out, PartitionLocationData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartitionLocationData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartitionLocationData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartitionLocationData
  * @throws IOException if the JSON string is invalid with respect to PartitionLocationData
  */
  public static PartitionLocationData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartitionLocationData.class);
  }

 /**
  * Convert an instance of PartitionLocationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

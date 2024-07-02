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
import org.apache.celeborn.server.common.http.v1.model.ConfigData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.server.common.http.v1.JSON;


/**
 * ConfResponse
 */
@JsonPropertyOrder({
  ConfResponse.JSON_PROPERTY_CONFIGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfResponse {
  public static final String JSON_PROPERTY_CONFIGS = "configs";
  private List<ConfigData> configs = null;

  public ConfResponse() { 
  }

  public ConfResponse configs(List<ConfigData> configs) {
    this.configs = configs;
    return this;
  }

  public ConfResponse addConfigsItem(ConfigData configsItem) {
    if (this.configs == null) {
      this.configs = null;
    }
    this.configs.add(configsItem);
    return this;
  }

   /**
   * Get configs
   * @return configs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConfigData> getConfigs() {
    return configs;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigs(List<ConfigData> configs) {
    this.configs = configs;
  }


  /**
   * Return true if this ConfResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfResponse confResponse = (ConfResponse) o;
    return Objects.equals(this.configs, confResponse.configs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfResponse {\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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


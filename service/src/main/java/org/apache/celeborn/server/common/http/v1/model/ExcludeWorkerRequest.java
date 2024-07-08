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
import org.apache.celeborn.server.common.http.v1.model.WorkerId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.server.common.http.v1.JSON;


/**
 * ExcludeWorkerRequest
 */
@JsonPropertyOrder({
  ExcludeWorkerRequest.JSON_PROPERTY_ADD,
  ExcludeWorkerRequest.JSON_PROPERTY_REMOVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExcludeWorkerRequest {
  public static final String JSON_PROPERTY_ADD = "add";
  private List<WorkerId> add = null;

  public static final String JSON_PROPERTY_REMOVE = "remove";
  private List<WorkerId> remove = null;

  public ExcludeWorkerRequest() { 
  }

  public ExcludeWorkerRequest add(List<WorkerId> add) {
    this.add = add;
    return this;
  }

  public ExcludeWorkerRequest addAddItem(WorkerId addItem) {
    if (this.add == null) {
      this.add = null;
    }
    this.add.add(addItem);
    return this;
  }

   /**
   * The workers to be added to the excluded workers.
   * @return add
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The workers to be added to the excluded workers.")
  @JsonProperty(JSON_PROPERTY_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WorkerId> getAdd() {
    return add;
  }


  @JsonProperty(JSON_PROPERTY_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdd(List<WorkerId> add) {
    this.add = add;
  }


  public ExcludeWorkerRequest remove(List<WorkerId> remove) {
    this.remove = remove;
    return this;
  }

  public ExcludeWorkerRequest addRemoveItem(WorkerId removeItem) {
    if (this.remove == null) {
      this.remove = null;
    }
    this.remove.add(removeItem);
    return this;
  }

   /**
   * The workers to be removed from the excluded workers.
   * @return remove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The workers to be removed from the excluded workers.")
  @JsonProperty(JSON_PROPERTY_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WorkerId> getRemove() {
    return remove;
  }


  @JsonProperty(JSON_PROPERTY_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemove(List<WorkerId> remove) {
    this.remove = remove;
  }


  /**
   * Return true if this ExcludeWorkerRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcludeWorkerRequest excludeWorkerRequest = (ExcludeWorkerRequest) o;
    return Objects.equals(this.add, excludeWorkerRequest.add) &&
        Objects.equals(this.remove, excludeWorkerRequest.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExcludeWorkerRequest {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
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


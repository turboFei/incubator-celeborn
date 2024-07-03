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
import org.apache.celeborn.rest.v1.model.AppDiskUsageSnapshotData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.celeborn.rest.v1.master.invoker.JSON;


/**
 * AppDiskUsageSnapshotsResponse
 */
@JsonPropertyOrder({
  AppDiskUsageSnapshotsResponse.JSON_PROPERTY_SNAPSHOTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-03T00:05:35.703792-07:00[America/Los_Angeles]")
public class AppDiskUsageSnapshotsResponse {
  public static final String JSON_PROPERTY_SNAPSHOTS = "snapshots";
  private List<AppDiskUsageSnapshotData> snapshots = null;

  public AppDiskUsageSnapshotsResponse() { 
  }

  public AppDiskUsageSnapshotsResponse snapshots(List<AppDiskUsageSnapshotData> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  public AppDiskUsageSnapshotsResponse addSnapshotsItem(AppDiskUsageSnapshotData snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = null;
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * The disk usage snapshots.
   * @return snapshots
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AppDiskUsageSnapshotData> getSnapshots() {
    return snapshots;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshots(List<AppDiskUsageSnapshotData> snapshots) {
    this.snapshots = snapshots;
  }


  /**
   * Return true if this AppDiskUsageSnapshotsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDiskUsageSnapshotsResponse appDiskUsageSnapshotsResponse = (AppDiskUsageSnapshotsResponse) o;
    return Objects.equals(this.snapshots, appDiskUsageSnapshotsResponse.snapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDiskUsageSnapshotsResponse {\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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


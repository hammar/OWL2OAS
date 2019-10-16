/*
 * RealEstateCore Core Module
 * The documentation below is automatically extracted from an <rdfs:comment> annotation on the ontology RealEstateCore Core Module:<br/><br/>*The REC core module collects the top-level classes and properties that span over or are reused within multiple REC modules.<br/><br/>Note that this module reuses certain classes, properties, and named individuals from other vocabularies, e.g., GeoSPARQL; the copyright conditions on those reused entities are stated in their respective rdfs:comments annotations.*
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Context;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * GeoReferenceOrigo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-16T06:50:30.499Z[GMT]")
public class GeoReferenceOrigo {
  @SerializedName("@context")
  private Context _atContext = null;

  @SerializedName("@id")
  private String _atId = null;

  @SerializedName("@type")
  private String _atType = "GeoReferenceOrigo";

  @SerializedName("label")
  private String label = null;

  @SerializedName("hasGeoReferenceBearing")
  private List<Double> hasGeoReferenceBearing = null;

  public GeoReferenceOrigo _atContext(Context _atContext) {
    this._atContext = _atContext;
    return this;
  }

   /**
   * Get _atContext
   * @return _atContext
  **/
  @Schema(description = "")
  public Context getAtContext() {
    return _atContext;
  }

  public void setAtContext(Context _atContext) {
    this._atContext = _atContext;
  }

  public GeoReferenceOrigo _atId(String _atId) {
    this._atId = _atId;
    return this;
  }

   /**
   * Get _atId
   * @return _atId
  **/
  @Schema(description = "")
  public String getAtId() {
    return _atId;
  }

  public void setAtId(String _atId) {
    this._atId = _atId;
  }

  public GeoReferenceOrigo _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

   /**
   * Get _atType
   * @return _atType
  **/
  @Schema(description = "")
  public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }

  public GeoReferenceOrigo label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public GeoReferenceOrigo hasGeoReferenceBearing(List<Double> hasGeoReferenceBearing) {
    this.hasGeoReferenceBearing = hasGeoReferenceBearing;
    return this;
  }

  public GeoReferenceOrigo addHasGeoReferenceBearingItem(Double hasGeoReferenceBearingItem) {
    if (this.hasGeoReferenceBearing == null) {
      this.hasGeoReferenceBearing = new ArrayList<Double>();
    }
    this.hasGeoReferenceBearing.add(hasGeoReferenceBearingItem);
    return this;
  }

   /**
   * Get hasGeoReferenceBearing
   * @return hasGeoReferenceBearing
  **/
  @Schema(description = "")
  public List<Double> getHasGeoReferenceBearing() {
    return hasGeoReferenceBearing;
  }

  public void setHasGeoReferenceBearing(List<Double> hasGeoReferenceBearing) {
    this.hasGeoReferenceBearing = hasGeoReferenceBearing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoReferenceOrigo geoReferenceOrigo = (GeoReferenceOrigo) o;
    return Objects.equals(this._atContext, geoReferenceOrigo._atContext) &&
        Objects.equals(this._atId, geoReferenceOrigo._atId) &&
        Objects.equals(this._atType, geoReferenceOrigo._atType) &&
        Objects.equals(this.label, geoReferenceOrigo.label) &&
        Objects.equals(this.hasGeoReferenceBearing, geoReferenceOrigo.hasGeoReferenceBearing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, _atId, _atType, label, hasGeoReferenceBearing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoReferenceOrigo {\n");
    
    sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
    sb.append("    _atId: ").append(toIndentedString(_atId)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    hasGeoReferenceBearing: ").append(toIndentedString(hasGeoReferenceBearing)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
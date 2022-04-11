/*
 * Credits
 * The Credits API provides information about customer credit lines.
 *
 * OpenAPI spec version: 2.2.0
 * Contact: gipinacho@santander.com.mx
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AwardPointsSimulation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-11T10:52:34.405704-05:00[America/Bogota]")
public class AwardPointsSimulation {
  @SerializedName("to_be_spent")
  private String toBeSpent = null;

  @SerializedName("post_balance")
  private String postBalance = null;

  public AwardPointsSimulation toBeSpent(String toBeSpent) {
    this.toBeSpent = toBeSpent;
    return this;
  }

   /**
   * Amount of award points to be used for paying the transaction.
   * @return toBeSpent
  **/
  @Schema(example = "30,000", description = "Amount of award points to be used for paying the transaction.")
  public String getToBeSpent() {
    return toBeSpent;
  }

  public void setToBeSpent(String toBeSpent) {
    this.toBeSpent = toBeSpent;
  }

  public AwardPointsSimulation postBalance(String postBalance) {
    this.postBalance = postBalance;
    return this;
  }

   /**
   * Calculated balance of the award points if is decided to use the option of payment with award points.
   * @return postBalance
  **/
  @Schema(example = "18,500", description = "Calculated balance of the award points if is decided to use the option of payment with award points.")
  public String getPostBalance() {
    return postBalance;
  }

  public void setPostBalance(String postBalance) {
    this.postBalance = postBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwardPointsSimulation awardPointsSimulation = (AwardPointsSimulation) o;
    return Objects.equals(this.toBeSpent, awardPointsSimulation.toBeSpent) &&
        Objects.equals(this.postBalance, awardPointsSimulation.postBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toBeSpent, postBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwardPointsSimulation {\n");
    
    sb.append("    toBeSpent: ").append(toIndentedString(toBeSpent)).append("\n");
    sb.append("    postBalance: ").append(toIndentedString(postBalance)).append("\n");
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

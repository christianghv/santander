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
import org.threeten.bp.OffsetDateTime;
/**
 * Retrieves the payment card basic information
 */
@Schema(description = "Retrieves the payment card basic information")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-11T10:52:34.405704-05:00[America/Bogota]")
public class PaymentDetail {
  @SerializedName("amount_payment")
  private AllOfPaymentDetailAmountPayment amountPayment = null;

  @SerializedName("minimum_amount")
  private AllOfPaymentDetailMinimumAmount minimumAmount = null;

  @SerializedName("operation_date")
  private OffsetDateTime operationDate = null;

  public PaymentDetail amountPayment(AllOfPaymentDetailAmountPayment amountPayment) {
    this.amountPayment = amountPayment;
    return this;
  }

   /**
   * Indicates the amount paid.
   * @return amountPayment
  **/
  @Schema(description = "Indicates the amount paid.")
  public AllOfPaymentDetailAmountPayment getAmountPayment() {
    return amountPayment;
  }

  public void setAmountPayment(AllOfPaymentDetailAmountPayment amountPayment) {
    this.amountPayment = amountPayment;
  }

  public PaymentDetail minimumAmount(AllOfPaymentDetailMinimumAmount minimumAmount) {
    this.minimumAmount = minimumAmount;
    return this;
  }

   /**
   * Indicates the minimum payment amount
   * @return minimumAmount
  **/
  @Schema(description = "Indicates the minimum payment amount")
  public AllOfPaymentDetailMinimumAmount getMinimumAmount() {
    return minimumAmount;
  }

  public void setMinimumAmount(AllOfPaymentDetailMinimumAmount minimumAmount) {
    this.minimumAmount = minimumAmount;
  }

  public PaymentDetail operationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
    return this;
  }

   /**
   * Indicates the date on which the payment was made. [ISO 8601] (https://www.iso.org/iso-8601-date-and-time-format.html
   * @return operationDate
  **/
  @Schema(example = "2012-02-16T23:38:45.408Z", description = "Indicates the date on which the payment was made. [ISO 8601] (https://www.iso.org/iso-8601-date-and-time-format.html")
  public OffsetDateTime getOperationDate() {
    return operationDate;
  }

  public void setOperationDate(OffsetDateTime operationDate) {
    this.operationDate = operationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetail paymentDetail = (PaymentDetail) o;
    return Objects.equals(this.amountPayment, paymentDetail.amountPayment) &&
        Objects.equals(this.minimumAmount, paymentDetail.minimumAmount) &&
        Objects.equals(this.operationDate, paymentDetail.operationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountPayment, minimumAmount, operationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetail {\n");
    
    sb.append("    amountPayment: ").append(toIndentedString(amountPayment)).append("\n");
    sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
    sb.append("    operationDate: ").append(toIndentedString(operationDate)).append("\n");
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

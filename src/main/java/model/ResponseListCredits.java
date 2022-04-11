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
import io.swagger.client.model.CreditList;
import io.swagger.client.model.Cursor;
import io.swagger.client.model.NotificationWrapper;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ResponseListCredits
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-11T10:52:34.405704-05:00[America/Bogota]")
public class ResponseListCredits {
  @SerializedName("data")
  private List<CreditList> data = null;

  @SerializedName("notifications")
  private List<NotificationWrapper> notifications = null;

  @SerializedName("paging")
  private Cursor paging = null;

  public ResponseListCredits data(List<CreditList> data) {
    this.data = data;
    return this;
  }

  public ResponseListCredits addDataItem(CreditList dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CreditList>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<CreditList> getData() {
    return data;
  }

  public void setData(List<CreditList> data) {
    this.data = data;
  }

  public ResponseListCredits notifications(List<NotificationWrapper> notifications) {
    this.notifications = notifications;
    return this;
  }

  public ResponseListCredits addNotificationsItem(NotificationWrapper notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<NotificationWrapper>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @Schema(description = "")
  public List<NotificationWrapper> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<NotificationWrapper> notifications) {
    this.notifications = notifications;
  }

  public ResponseListCredits paging(Cursor paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @Schema(description = "")
  public Cursor getPaging() {
    return paging;
  }

  public void setPaging(Cursor paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseListCredits responseListCredits = (ResponseListCredits) o;
    return Objects.equals(this.data, responseListCredits.data) &&
        Objects.equals(this.notifications, responseListCredits.notifications) &&
        Objects.equals(this.paging, responseListCredits.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, notifications, paging);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseListCredits {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

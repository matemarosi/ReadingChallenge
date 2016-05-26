package com.bme.aut.readingchallenge.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Read   {
  
  @SerializedName("read_id")
  private String readId = null;
  
  @SerializedName("user_id")
  private String userId = null;
  
  @SerializedName("read_date")
  private String readDate = null;
  
  @SerializedName("stars")
  private BigDecimal stars = null;
  
  @SerializedName("comments")
  private String comments = null;
  

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public String getReadId() {
    return readId;
  }
  public void setReadId(String readId) {
    this.readId = readId;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public String getReadDate() {
    return readDate;
  }
  public void setReadDate(String readDate) {
    this.readDate = readDate;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public BigDecimal getStars() {
    return stars;
  }
  public void setStars(BigDecimal stars) {
    this.stars = stars;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Read read = (Read) o;
    return Objects.equals(readId, read.readId) &&
        Objects.equals(userId, read.userId) &&
        Objects.equals(readDate, read.readDate) &&
        Objects.equals(stars, read.stars) &&
        Objects.equals(comments, read.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readId, userId, readDate, stars, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Read {\n");
    
    sb.append("    readId: ").append(toIndentedString(readId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    readDate: ").append(toIndentedString(readDate)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

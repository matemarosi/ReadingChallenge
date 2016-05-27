package com.bme.aut.readingchallenge.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Book   {
  
  @SerializedName("book_id")
  private String bookId = null;
  
  @SerializedName("title")
  private String title = null;
  
  @SerializedName("author")
  private String author = null;
  
  @SerializedName("image")
  private String image = null;
  
  @SerializedName("pages")
  private BigDecimal pages = null;
  
  @SerializedName("publish_date")
  private BigDecimal publishDate = null;
  
  @SerializedName("category")
  private String category = null;
  

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public String getBookId() {
    return bookId;
  }
  public void setBookId(String bookId) {
    this.bookId = bookId;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public BigDecimal getPages() {
    return pages;
  }
  public void setPages(BigDecimal pages) {
    this.pages = pages;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public BigDecimal getPublishDate() {
    return publishDate;
  }
  public void setPublishDate(BigDecimal publishDate) {
    this.publishDate = publishDate;
  }

  
  /**
   * todo
   **/
  @ApiModelProperty(value = "todo")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(bookId, book.bookId) &&
        Objects.equals(title, book.title) &&
        Objects.equals(author, book.author) &&
        Objects.equals(image, book.image) &&
        Objects.equals(pages, book.pages) &&
        Objects.equals(publishDate, book.publishDate) &&
        Objects.equals(category, book.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, title, author, image, pages, publishDate, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

package com.bme.aut.readingchallenge.api;

import io.swagger.client.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.swagger.client.model.Book;
import io.swagger.client.model.Error;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BooksApi {
  
  /**
   * Add Book
   * todo
   * @param startLatitude Latitude component of start location.
   * @param startLongitude Longitude component of start location.
   * @param customerUuid Unique customer identifier to be used for experience customization.
   * @param productId Unique identifier representing a specific product for a given latitude &amp; longitude.
   * @return Call<List<Book>>
   */
  
  @GET("add")
  Call<List<Book>> addGet(
    @Query("start_latitude") Double startLatitude, @Query("start_longitude") Double startLongitude, @Query("customer_uuid") UUID customerUuid, @Query("product_id") String productId
  );

  
  /**
   * List of Books
   * Blablabla
   * @return Call<List<Book>>
   */
  
  @GET("books")
  Call<List<Book>> booksGet();
    

  
}

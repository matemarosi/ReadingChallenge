package com.bme.aut.readingchallenge.api;

import io.swagger.client.CollectionFormats.*;
import io.swagger.client.model.InlineResponse200;
import retrofit2.Call;
import retrofit2.http.*;

public interface UsersApi {
  
  /**
   * Logint to ReadingChallenge
   * todo
   * @param name Name
   * @param password Password
   * @return Call<InlineResponse200>
   */
  
  @POST("login")
  Call<InlineResponse200> loginPost(
    @Query("name") String name, @Query("password") String password
  );

  
}

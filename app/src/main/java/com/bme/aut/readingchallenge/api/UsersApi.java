package com.bme.aut.readingchallenge.api;

//import com.bme.aut.readingchallenge.CollectionFormats.*;
import com.bme.aut.readingchallenge.model.InlineResponse200;
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

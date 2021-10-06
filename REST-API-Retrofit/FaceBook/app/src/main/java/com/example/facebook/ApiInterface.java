package com.example.facebook;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    /**
     * Retrofit with GET Method
     * Normal
     * with Query
     * with dynamic Path
     * @return
     */
    @GET("posts/1")
    public Call<Post> getPost();
    @GET("posts")
    public Call<List<Post>> getPostQurey(@Query("userId") String userId);
    @GET("posts/{id}")
    public Call<Post> getPostPath(@Path("id") int postId);
    /**
     * Retrofit with POST Method
     * with Class
     * Hash Map
     * @return
     */
    @POST("posts")
    public Call<Post> storePost(@Body Post post);
    @POST("posts")
    public Call<Post> storePostHash(@Body HashMap<Object,Object> map);

}

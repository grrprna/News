package com.gururpirana.news;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mobiltrakya on 22/12/16.
 */

public interface NewsService {
    @GET("articles")
    Call<NewsModel> getNews(@Query("source")String source,
                            @Query("apiKey") String apiKey);
}

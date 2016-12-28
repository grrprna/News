package com.gururpirana.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
        .build();
        ImageLoader.getInstance().init(config);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl("https://newsapi.org/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NewsService mNewsService = mRetrofit.create(NewsService.class);

        Call<NewsModel> mCall = mNewsService.getNews("time","18ddf2502e674f82b3dee6b98f5425e4");

        mCall.enqueue(new Callback<NewsModel>() {
            @Override
            public void onResponse(Call<NewsModel> call, Response<NewsModel> response) {
                mRecyclerView.setAdapter(new adapter.NewsAdapter(response.body().getArticles()));
                Log.d("hello:",response.body().getArticles().get(0).getDescription());

            }

            @Override
            public void onFailure(Call<NewsModel> call, Throwable t) {

                Toast.makeText(getApplicationContext(), R.string.error_message, Toast.LENGTH_LONG).show();
            }
        });

    }

}

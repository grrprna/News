package com.gururpirana.news;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by mobiltrakya on 22/12/16.
 */

public class adapter {
    public static NewsModel.ArticlesBean articlesBean;
    public static class NewsAdapter extends RecyclerView.Adapter<NewsHolder> {

        List<NewsModel.ArticlesBean> mNewsModelArticle;


        public NewsAdapter(List<NewsModel.ArticlesBean> newsModel) {
            mNewsModelArticle = newsModel;
        }

        @Override
        public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
            NewsHolder holder = new NewsHolder(v);
            return holder;
        }

        @Override
        public void onBindViewHolder(NewsHolder holder, int position) {
            articlesBean = mNewsModelArticle.get(position);
            holder.fill(articlesBean);

        }

        @Override
        public int getItemCount() {
            return mNewsModelArticle.size();
        }
    }

    public static class NewsHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView mhaberResim;
        private TextView mhaberBaslik,mhaberAciklama;
        String mUrl;
        ImageLoader mImageLoader = ImageLoader.getInstance();


        public NewsHolder(View itemView) {

            super(itemView);
            itemView.setOnClickListener(this);
            mhaberAciklama= (TextView) itemView.findViewById(R.id.haberAciklama);
            mhaberBaslik = ( TextView) itemView.findViewById(R.id.haberBaslik);
            mhaberResim = (ImageView) itemView.findViewById(R.id.haberResim);

        }
        public void fill(NewsModel.ArticlesBean articlesBean)
        {
            mhaberBaslik.setText(articlesBean.getTitle());
            mhaberAciklama.setText(articlesBean.getDescription());
            mImageLoader.displayImage(articlesBean.getUrlToImage(), mhaberResim);
            mUrl = articlesBean.getUrl();

        }

        @Override
        public void onClick(View view) {
           Intent mIntent = new Intent(itemView.getContext(),WebViewActivity.class);
            mIntent.putExtra("url",mUrl);
            itemView.getContext().startActivity(mIntent);

        }
    }

}

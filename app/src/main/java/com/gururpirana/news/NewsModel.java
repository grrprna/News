package com.gururpirana.news;

import java.util.List;

/**
 * Created by mobiltrakya on 22/12/16.
 */

public class NewsModel {
    /**
     * status : ok
     * source : techcrunch
     * sortBy : top
     * articles : [{"author":"Khaled \"Tito\" Hamze","title":"Crunch Report","description":"Your daily roundup of the biggest TechCrunch stories and startup news.","url":"http://social.techcrunch.com/video/crunchreport/","urlToImage":"https://tctechcrunch2011.files.wordpress.com/2015/03/tccrshowogo.jpg?w=500&amp;h=200&amp;crop=1","publishedAt":"2016-12-22T03:20:11Z"},{"author":"Josh Constine","title":"BitTorrent Live\u2019s \u201ccable-killer\u201d P2P video app finally hits iOS","description":"Cable companies rule TV because they control the expensive wires and satellites that can deliver low-latency live content at scale. Cable companies can then..","url":"http://social.techcrunch.com/2016/12/21/how-bittorrent-live-works/","urlToImage":"https://tctechcrunch2011.files.wordpress.com/2016/12/bittorrent-live.png?w=680&amp;h=356&amp;crop=1","publishedAt":"2016-12-21T22:42:51Z"},{"author":"Sarah Buhr","title":"Move over Cas9, CRISPR-Cas3 might hold the key to solving the antibiotics crisis","description":"Researchers at North Carolina-based Locus Biosciences think they have a potential cure for antibiotic resistance using CRISPR's lesser-known Cas3 enzyme...","url":"http://social.techcrunch.com/2016/12/21/move-over-cas9-crispr-cas3-might-hold-the-key-to-solving-the-antibiotics-crisis/","urlToImage":"https://tctechcrunch2011.files.wordpress.com/2016/12/916a28d4ca64414767880a14c6c8604b-1.jpg?w=764&amp;h=400&amp;crop=1","publishedAt":"2016-12-21T20:14:04Z"},{"author":"Josh Constine","title":"Zuckerberg implies Facebook is a media company, just \u201cnot a traditional media company\u201d","description":"Mark Zuckerberg gave new insights about how he sees Facebook's role in informing the world today during a Live video one-on-one year-end chat with COO Sheryl..","url":"http://social.techcrunch.com/2016/12/21/fbonc/","urlToImage":"https://tctechcrunch2011.files.wordpress.com/2016/12/zuckerberg-leader.jpeg?w=764&amp;h=400&amp;crop=1","publishedAt":"2016-12-21T19:46:48Z"},{"author":"Matthew Lynley","title":"Alphabet tried to convince Wall Street it\u2019s not just a search engine this year","description":"Google (or Alphabet, if you prefer) has long been plagued with a problem with its advertising business: while the number of ads people are clicking on has..","url":"http://social.techcrunch.com/2016/12/21/alphabet-tried-to-convince-wall-street-its-not-just-a-search-engine-this-year/","urlToImage":"https://tctechcrunch2011.files.wordpress.com/2016/07/a3c4057e7d804c79b4bfb3278f4afced.jpg?w=764&amp;h=400&amp;crop=1","publishedAt":"2016-12-21T17:00:33Z"}]
     */

    private String status;
    private String source;
    private String sortBy;
    /**
     * author : Khaled "Tito" Hamze
     * title : Crunch Report
     * description : Your daily roundup of the biggest TechCrunch stories and startup news.
     * url : http://social.techcrunch.com/video/crunchreport/
     * urlToImage : https://tctechcrunch2011.files.wordpress.com/2015/03/tccrshowogo.jpg?w=500&amp;h=200&amp;crop=1
     * publishedAt : 2016-12-22T03:20:11Z
     */

    private List<ArticlesBean> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public List<ArticlesBean> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesBean> articles) {
        this.articles = articles;
    }

    public static class ArticlesBean {
        private String author;
        private String title;
        private String description;
        private String url;
        private String urlToImage;
        private String publishedAt;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }
    }
}

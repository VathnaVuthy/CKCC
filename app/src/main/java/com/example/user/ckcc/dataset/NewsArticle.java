package com.example.user.ckcc.dataset;

/**
 * Created by User on 4/25/2017.
 */

public class NewsArticle {
    private String title;
    private String date;

    public NewsArticle(String title, String date) {
        this.title = title;
        this.date = date;
    }
    public void setArticleNews(String title,String date){
        this.title = title;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

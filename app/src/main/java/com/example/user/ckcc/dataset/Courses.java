package com.example.user.ckcc.dataset;

/**
 * Created by User on 4/27/2017.
 */

public class Courses {
    private String imgUrl;
    private String title;
    private String date;

    public Courses(String imgUrl, String title, String date) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.date = date;
    }
    public Courses(String title,String date){
        this.title = title;
        this.date = date;
    }
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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

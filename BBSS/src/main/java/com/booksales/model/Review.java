package com.booksales.model;

import java.util.Date;

public class Review {
    private Integer reviewid;

    private Integer userid;

    private Integer bookid;

    private Date reviewtime;

    private String reviewcontext;

    private Integer reviewlevel;

    public Integer getReviewid() {
        return reviewid;
    }

    public void setReviewid(Integer reviewid) {
        this.reviewid = reviewid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Date getReviewtime() {
        return reviewtime;
    }

    public void setReviewtime(Date reviewtime) {
        this.reviewtime = reviewtime;
    }

    public String getReviewcontext() {
        return reviewcontext;
    }

    public void setReviewcontext(String reviewcontext) {
        this.reviewcontext = reviewcontext == null ? null : reviewcontext.trim();
    }

    public Integer getReviewlevel() {
        return reviewlevel;
    }

    public void setReviewlevel(Integer reviewlevel) {
        this.reviewlevel = reviewlevel;
    }
}
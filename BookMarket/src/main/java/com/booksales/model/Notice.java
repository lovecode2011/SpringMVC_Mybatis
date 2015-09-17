package com.booksales.model;

import java.util.Date;

public class Notice {
    private Integer noticeid;

    private String notictitle;

    private Date noticetime;

    private Integer bookid;

    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNotictitle() {
        return notictitle;
    }

    public void setNotictitle(String notictitle) {
        this.notictitle = notictitle == null ? null : notictitle.trim();
    }

    public Date getNoticetime() {
        return noticetime;
    }

    public void setNoticetime(Date noticetime) {
        this.noticetime = noticetime;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }
}
package com.booksales.model;

import java.io.Serializable;
import java.util.Date;

public class Notice  implements Serializable{
	//公告id 
    private Integer noticeid;
    //公告标题
    private String notictitle;
    //公告时间
    private Date noticetime;
    //对应图书的id（当公告说新书上架，或是商品打折，对应图书的id）
    private Integer bookid;
    
    public Notice() {
		super();
	}

	public Notice(Integer noticeid, String notictitle, Date noticetime,
			Integer bookid) {
		super();
		this.noticeid = noticeid;
		this.notictitle = notictitle;
		this.noticetime = noticetime;
		this.bookid = bookid;
	}
	
	@Override
	public String toString() {
		return "Notice [noticeid=" + noticeid + ", notictitle=" + notictitle
				+ ", noticetime=" + noticetime + ", bookid=" + bookid + "]";
	}

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
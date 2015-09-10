package com.booksales.model;

import java.io.Serializable;
import java.util.Date;

public class Review  implements Serializable{
	//评论id 
    private Integer reviewid;
    //该评论的作者id
    private Integer userid;
    //该评论对应的书的id
    private Integer bookid;
    //评论时间
    private Date reviewtime;
    //评论文本
    private String reviewcontext;
    //评价等价
    private Integer reviewlevel;

    public Review() {
		super();
	}

	public Review(Integer reviewid, Integer userid, Integer bookid,
			Date reviewtime, String reviewcontext, Integer reviewlevel) {
		super();
		this.reviewid = reviewid;
		this.userid = userid;
		this.bookid = bookid;
		this.reviewtime = reviewtime;
		this.reviewcontext = reviewcontext;
		this.reviewlevel = reviewlevel;
	}

	@Override
	public String toString() {
		return "Review [reviewid=" + reviewid + ", userid=" + userid
				+ ", bookid=" + bookid + ", reviewtime=" + reviewtime
				+ ", reviewcontext=" + reviewcontext + ", reviewlevel="
				+ reviewlevel + "]";
	}

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
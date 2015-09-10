package com.booksales.model;

import java.io.Serializable;

public class BSCollect implements Serializable {
	//收藏id
    private Integer collectid;
    //用户id
    private Integer userid;
    //用户收藏的图书id
    private Integer bookid;
    //无参构造方法
    public BSCollect() {
		super();
	}
    //构造方法
	public BSCollect(Integer collectid, Integer userid, Integer bookid) {
		super();
		this.collectid = collectid;
		this.userid = userid;
		this.bookid = bookid;
	}
	
	@Override
	public String toString() {
		return "BSCollect [collectid=" + collectid + ", userid=" + userid
				+ ", bookid=" + bookid + "]";
	}

	public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
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
}
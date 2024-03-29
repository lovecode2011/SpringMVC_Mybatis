package com.booksales.model;

import java.util.Date;

/**
 * 评论类的包装类
 * 
 * @author Wwhaha
 *
 */
public class CommentWapper {
	private Integer commentid;
	private Integer userid;
	private String username;
	private Integer bookid;
	private Date commenttime;
	private String commentcontext;
	private Integer commentlevel;

	public Integer getCommentid() {
		return commentid;
	}

	public void setCommentid(Integer commentid) {
		this.commentid = commentid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public Date getCommenttime() {
		return commenttime;
	}

	public void setCommenttime(Date commenttime) {
		this.commenttime = commenttime;
	}

	public String getCommentcontext() {
		return commentcontext;
	}

	public void setCommentcontext(String commentcontext) {
		this.commentcontext = commentcontext;
	}

	public Integer getCommentlevel() {
		return commentlevel;
	}

	public void setCommentlevel(Integer commentlevel) {
		this.commentlevel = commentlevel;
	}
}

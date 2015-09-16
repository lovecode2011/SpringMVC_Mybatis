package com.booksales.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Book {
	private Integer bookid;

	private String bookname;

	private String author;

	private String publish;

	private String isbn;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date publishdate;

	private String picture;

	private String repertory;

	private Integer price;

	private Integer stock;

	private Integer sales;

	private Integer bookclassid;

	private String isrecommend;

	private String intro;

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname == null ? null : bookname.trim();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author == null ? null : author.trim();
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish == null ? null : publish.trim();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn == null ? null : isbn.trim();
	}

	// public Date getPublishdate() {
	// return publishdate;
	// }
	//
	// public void setPublishdate(Date publishdate) {
	// this.publishdate = publishdate;
	// }

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture == null ? null : picture.trim();
	}

	public String getRepertory() {
		return repertory;
	}

	public void setRepertory(String repertory) {
		this.repertory = repertory == null ? null : repertory.trim();
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Integer getBookclassid() {
		return bookclassid;
	}

	public void setBookclassid(Integer bookclassid) {
		this.bookclassid = bookclassid;
	}

	public String getIsrecommend() {
		return isrecommend;
	}

	public void setIsrecommend(String isrecommend) {
		this.isrecommend = isrecommend == null ? null : isrecommend.trim();
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro == null ? null : intro.trim();
	}
}
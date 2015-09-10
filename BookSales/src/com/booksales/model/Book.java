package com.booksales.model;

import java.io.Serializable;
import java.util.Date;
/**
 * 图书类
 */
public class Book implements Serializable {
	
	

	//图书id
    private Integer bookid;
    //图书名称
    private String bookname;
    //作者
    private String author;
    //出版社
    private String publish;
    //ISBN
    private String isbn;
    //出版日期
    private Date publishdate;
    //图书图片
    private String picture;
    //图书仓库（枚举值='武汉','广州','北京'）
    private String repertory;
    //图书价格
    private Long price;
    //图书存储量
    private Integer instock;
    //销售量
    private Integer sales;
    //图书分类id
    private Integer bookclassifyid;
    //是否推荐（枚举值（0=不推荐或是1=推荐））
    private Integer isrecommend;
    //图书介绍
    private String introduction;
    
  //无参构造方法
  	public Book() {
  		super();
  	}
  	//构造方法
  	public Book(Integer bookid, String bookname, String author, String publish,
  			String isbn, Date publishdate, String picture, String repertory,
  			Long price, Integer instock, Integer sales, Integer bookclassifyid,
  			Integer isrecommend, String introduction) {
  		super();
  		this.bookid = bookid;
  		this.bookname = bookname;
  		this.author = author;
  		this.publish = publish;
  		this.isbn = isbn;
  		this.publishdate = publishdate;
  		this.picture = picture;
  		this.repertory = repertory;
  		this.price = price;
  		this.instock = instock;
  		this.sales = sales;
  		this.bookclassifyid = bookclassifyid;
  		this.isrecommend = isrecommend;
  		this.introduction = introduction;
  	}
  	
  	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname
				+ ", author=" + author + ", publish=" + publish + ", isbn="
				+ isbn + ", publishdate=" + publishdate + ", picture="
				+ picture + ", repertory=" + repertory + ", price=" + price
				+ ", instock=" + instock + ", sales=" + sales
				+ ", bookclassifyid=" + bookclassifyid + ", isrecommend="
				+ isrecommend + ", introduction=" + introduction + "]";
	}

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

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getInstock() {
        return instock;
    }

    public void setInstock(Integer instock) {
        this.instock = instock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getBookclassifyid() {
        return bookclassifyid;
    }

    public void setBookclassifyid(Integer bookclassifyid) {
        this.bookclassifyid = bookclassifyid;
    }

    public Integer getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}
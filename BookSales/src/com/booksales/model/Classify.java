package com.booksales.model;

import java.io.Serializable;

public class Classify implements Serializable{
	//图书分类id
    private Integer classifyid;
    //图书分类名称
    private String classifyname;
    //该图书分类的父类分类的id
    private Integer classifyfatherid;
    
    public Classify() {
		super();
	}

	public Classify(Integer classifyid, String classifyname,
			Integer classifyfatherid) {
		super();
		this.classifyid = classifyid;
		this.classifyname = classifyname;
		this.classifyfatherid = classifyfatherid;
	}
	
	@Override
	public String toString() {
		return "Classify [classifyid=" + classifyid + ", classifyname="
				+ classifyname + ", classifyfatherid=" + classifyfatherid + "]";
	}

	public Integer getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(Integer classifyid) {
        this.classifyid = classifyid;
    }

    public String getClassifyname() {
        return classifyname;
    }

    public void setClassifyname(String classifyname) {
        this.classifyname = classifyname == null ? null : classifyname.trim();
    }

    public Integer getClassifyfatherid() {
        return classifyfatherid;
    }

    public void setClassifyfatherid(Integer classifyfatherid) {
        this.classifyfatherid = classifyfatherid;
    }
}
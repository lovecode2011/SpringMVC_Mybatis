package com.booksales.model;

public class Classify {
    private Integer classifyid;

    private String classifyname;

    private Integer classifyfatherid;

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
package com.booksales.model;

public class Class {
    private Integer classid;

    private String classname;

    private Integer classfatherid;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getClassfatherid() {
        return classfatherid;
    }

    public void setClassfatherid(Integer classfatherid) {
        this.classfatherid = classfatherid;
    }
}
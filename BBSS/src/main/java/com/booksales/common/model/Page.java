package com.booksales.common.model;
import java.util.List;

public class Page<T> {
 
    private int pageSize = 5;
    private int pageNum = 1;
    private int totalPage = 1;
    private int totalSize;
     
    // 数据列表，实际项目中可根据需要确认是否添加这个属性
    private List<T> itemList;
     
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
    public int getTotalSize() {
        return totalSize;
    }
    public void setTotalSize(int totalSize) {
        if (this.totalSize % this.pageSize != 0) {
            this.totalPage = (int)(this.totalSize / this.pageSize + 1);
        }else {
            this.totalPage = (int)(this.totalSize / this.pageSize);
        }
        if(totalPage == 0) totalPage = 1;
        this.totalSize = totalSize;
    }
	public List<T> getItemList() {
		return itemList;
	}
	public void setItemList(List<T> itemList) {
		this.itemList = itemList;
	}
    
 }
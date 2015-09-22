package com.booksales.common.model;

import java.util.List;

public class Node {
	private String text;
	private List<Node2> nodes;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<Node2> getNodes() {
		return nodes;
	}
	public void setNodes(List<Node2> nodes) {
		this.nodes = nodes;
	}
	

}

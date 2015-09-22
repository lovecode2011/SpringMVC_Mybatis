package com.booksales.common.model;

import java.util.List;

public class TreeJson {
private String text;
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public List<Node> getNodes() {
	return nodes;
}
public void setNodes(List<Node> nodes) {
	this.nodes = nodes;
}
private List<Node> nodes;
}

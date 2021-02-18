package com.example.demo.entity;

import java.io.Serializable;

public class Part implements Serializable{
	public Part(String partId, String title, String detail, String url) {
		super();
		this.partId = partId;
		this.title = title;
		this.detail = detail;
		this.url = url;
	}
	private String partId;
	private String title;
	private String detail;
	private String url;
	public String getPartId() {
		return partId;
	}
	public void setPartId(String partId) {
		this.partId = partId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}

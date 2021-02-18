package com.example.demo.entity;

import java.io.Serializable;

public class UrlInfo implements Serializable{
	public UrlInfo(String url, String detail) {
		super();
		this.url = url;
		this.detail = detail;
	}
	private String url;
	private String detail;
	public String getUrl() {
		return url;
	}
	public String getDetail() {
		return detail;
	}
}

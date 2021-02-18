package com.example.demo.entity;

import java.io.Serializable;

public class Entity implements Serializable{
	public Entity(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	private String name;
	private String value;
	public String getName() {
		return name;
	}
	public String getValue() {
		return value;
	}
}

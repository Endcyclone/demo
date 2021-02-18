package com.example.demo.service.impl;

import com.example.demo.entity.Entity;
import com.example.demo.service.GetTaroService;

//@Service
public class GetTaroServiceImpl2 implements GetTaroService{
	@Override
	public Entity getTaro() {
		return new Entity("2", "Taro");
	}
}

package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Entity;
import com.example.demo.service.GetTaroService;

@Service
public class GetTaroServiceImpl1 implements GetTaroService{
	@Override
	public Entity getTaro() {
		return new Entity("1", "Taro");
	}
}

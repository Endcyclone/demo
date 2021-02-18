package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Part;
import com.example.demo.service.GetPartsListService;

@Service
public class GetPartsListServiceImpl implements GetPartsListService{
	@Override
	public List<Part> getPartsList(){
		List<Part> result = new ArrayList<Part>();
		result.add(new Part("4179243", "負荷分散のための・・・", "Webサイトにおいて・・・", "https://aaa.aaa.jp"));
		result.add(new Part("3232459", "FastAPP環境構築用", "AWSのVPC上に・・・", "https://bbb.aaa.jp"));
		return result;
	}
}

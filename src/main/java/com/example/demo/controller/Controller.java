package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Entity;
import com.example.demo.entity.Part;
import com.example.demo.entity.UrlInfo;
import com.example.demo.exception.InternalServerErrorException;
import com.example.demo.exception.MyException;
import com.example.demo.service.GetPartsListService;
import com.example.demo.service.GetTaroService;

@RestController
public class Controller {

	@Autowired
	GetTaroService service;
	@Autowired
	GetPartsListService partService;

	@GetMapping
	public List<UrlInfo> getResources() {
		List<UrlInfo> list = new ArrayList<UrlInfo>();
		list.add(new UrlInfo("/get_parts_list_test", "知財一覧を返すAPIのテストです"));
		list.add(new UrlInfo("/header_test", "リクエストヘッダのauthorizationを返します"));
		return list;
	}

	@GetMapping("get_parts_list_test")
	public List<Part> getResource() {
		return partService.getPartsList();
	}

	@GetMapping("/header_test")
	public List<Entity> getHeader(
			@RequestHeader(name = "AuthorizationId", required = false) String authorizationId,
			@RequestHeader(name = "AuthorizationPw", required = false) String authorizationPw
			) {
		List<Entity> list = new ArrayList<Entity>();
		list.add(new Entity("AuthorizationId", authorizationId));
		list.add(new Entity("AuthorizaitonPw", authorizationPw));
		return list;
	}

	@GetMapping("get_parts_list_empty")
	public List<Part> getEmptyResource() throws MyException {
		//List<Part> list = new ArrayList<Part>();
		List<Part> list = null;
		if (list == null) {
			throw new MyException();
		}
		else return list;
	}

	@GetMapping("error")
	public void error500() throws InternalServerErrorException {
		throw new InternalServerErrorException();
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({MyException.class})
	public String catchMyException() {
		System.out.println("caught MyException");
		return "caught MyException";
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({InternalServerErrorException.class})
	public String catchInternalServerErrorException() {
		System.out.println("error 500");
		return "caught Exception";
	}

}

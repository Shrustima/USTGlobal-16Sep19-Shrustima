package com.ustglobal.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {

	public Hello() {
		System.out.println("Hello object created");
	}
	private String msg;

	private Map<String, Integer> map;
	
	public Map<String, Integer> getMap(){
		return map;
	}
	
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@PostConstruct
	void init() {
		System.out.println("init method executing from hello");
	}
	
	@PreDestroy
	void destroy() {
		System.out.println("Destroy method executing from hello");
	}
}

package com.ustglobal.springcore.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

	private String author;
	private String name;
	private int price;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@PostConstruct
	void init() {
		System.out.println("init method executing from book");
	}
	
	@PreDestroy
	void destroy() {
		System.out.println("Destroy method executing from book");
	}


	
}

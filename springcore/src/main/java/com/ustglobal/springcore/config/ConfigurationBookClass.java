package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

@Configuration
public class ConfigurationBookClass {

	@Bean(name = "book")
	//@Scope("prototype")
	public Book getBook() {
		Book book = new Book();
		book.setAuthor("Rabindranath");
		book.setName("LOve");
		book.setPrice(2499);
		return  book;
	}
	
	
}

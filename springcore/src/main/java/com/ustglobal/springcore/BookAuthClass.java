package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;

public class BookAuthClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("books.xml");
		Book book = context.getBean(Book.class);
		System.out.println(book.getAuthor());
		context.close();
	}
}

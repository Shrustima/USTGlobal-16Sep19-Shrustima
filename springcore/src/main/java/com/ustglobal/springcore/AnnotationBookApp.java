package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigurationBookClass;
import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class AnnotationBookApp {

	public static void main(String[] args) {
		
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBookClass.class);
		
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor());
		
		
		
		//Animal animal = context.getBean(Animal.class);
		//animal.makeSound();
		
		System.out.println("**********************");
		
		Book author = context.getBean(Book.class);
		System.out.println(author.getName());
		
		
		context.close();
	}
	
}

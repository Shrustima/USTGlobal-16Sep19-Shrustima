package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Hello;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {

	@Bean(name = "hello")
	//@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I Love Python");
		return  hello;
	}
	
//	@Bean(name = "dog")
//	public Dog getDog() {
//		return new Dog();
//	}
//	
//	@Bean(name = "cat")
//	public Cat getCat() {
//		return new Cat();
//		
//	}
//	
//	@Bean(name = "pet")
//	public Pet getPet() {
//		Pet pet = new Pet();
//		pet.setName("scooby");
//		//pet.setAnimal(getDog());
//		return pet;
//	}
}

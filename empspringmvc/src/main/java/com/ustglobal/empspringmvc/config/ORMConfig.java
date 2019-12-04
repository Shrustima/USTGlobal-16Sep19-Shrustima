package com.ustglobal.empspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ORMConfig {                       //class to create entity manager factory

	@Bean
	public LocalEntityManagerFactoryBean getBean() {
		
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("employee-unit");
		return bean;
		
	}
}

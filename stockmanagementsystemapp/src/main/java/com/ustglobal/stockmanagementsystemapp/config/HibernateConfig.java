package com.ustglobal.stockmanagementsystemapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class HibernateConfig {

	@Bean
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean localEntityManagerFactoryBean =
				new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("sms-unit");
		
		return localEntityManagerFactoryBean;
	}// end of getLocalEntityManagerFactoryBean()
	
}// end of HibernateConfig

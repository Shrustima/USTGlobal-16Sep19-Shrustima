package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		Product productDetail =  entityManager.find(Product.class, 101);     //to read
		System.out.println("ID----"+productDetail.getId());
		System.out.println("NAME----"+productDetail.getPname());
		System.out.println("QUANTITY----"+productDetail.getQuantity());
		entityManager.close();
		
		
		
	}
}

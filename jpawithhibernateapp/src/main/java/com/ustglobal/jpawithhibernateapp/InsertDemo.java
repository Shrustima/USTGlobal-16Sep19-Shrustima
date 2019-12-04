package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setId(103);
		product.setPname("mobile");
		product.setQuantity(12);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);                     //to insert
		System.out.println("Record saved");
		entityTransaction.commit();
		entityManager.close();
		
	}
}

package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetReference {

	public static void main(String[] args) {

		EntityManager entityManager = null;

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager  = entityManagerFactory.createEntityManager();
			
			//Product product = entityManager.getReference(Product.class, 101);             
			//			System.out.println(product.getId());
			//			System.out.println(product.getPname());
			//			System.out.println(product.getQuantity());
			
			Product product = entityManager.find(Product.class, 101);
			System.out.println(product.getClass());
			entityManager.close();
	}
}

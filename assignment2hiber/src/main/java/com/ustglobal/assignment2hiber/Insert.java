package com.ustglobal.assignment2hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment2hiber.dto.Pro;


public class Insert {

	public static void main(String[] args) {

		Pro product = new Pro();
		product.setPid(10);
		product.setPname("pencil");
		product.setPquantity(10);

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

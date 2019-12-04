package com.ustglobal.assignment2hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.assignment2hiber.dto.Pro;

public class Read {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		Pro productDetail =  entityManager.find(Pro.class, 10);     //to read
		System.out.println("ID----"+productDetail.getPid());
		System.out.println("NAME----"+productDetail.getPname());
		System.out.println("QUANTITY----"+productDetail.getPquantity());
		entityManager.close();
		
		
		
	}
}

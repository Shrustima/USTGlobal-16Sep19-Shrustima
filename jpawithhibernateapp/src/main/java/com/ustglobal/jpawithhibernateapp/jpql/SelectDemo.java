package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class SelectDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//String jpql = "from Product";
		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);
		List<String> products =  query.getResultList();
		for(String product : products) {
//			System.out.println(product.getId());
//			System.out.println(product.getPname());
//			System.out.println(product.getQuantity());
			System.out.println("********************");
			System.out.println(product);
			
		}
		entityManager.close();
		
		
	}
}

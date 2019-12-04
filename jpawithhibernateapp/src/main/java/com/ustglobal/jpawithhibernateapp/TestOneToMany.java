package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;
import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;

public class TestOneToMany {
	
public static void main(String[] args) {
	
	PencilBox pb = new PencilBox();
	pb.setBid(1);
	pb.setBname("Apsara");
	
	Pencil p1 = new Pencil();
	p1.setPid(10);
	p1.setColor("black");
	p1.setPencilBox(pb);
	
	Pencil p2 = new Pencil();
	p2.setPid(12);
	p2.setColor("red");
	p2.setPencilBox(pb);
	
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
		
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager  = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		
		System.out.println("Record saved");
		entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}

}

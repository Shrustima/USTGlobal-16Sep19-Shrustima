package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;
import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {

		VoterCard vc = new VoterCard();
		vc.setVid(1);
		vc.setVname("shr");

		Person p = new Person();
		p.setPid(10);
		p.setPname("shru");
		p.setVoterCard(vc);

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager  = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard=entityManager.find(VoterCard.class, 1);
			System.out.println(vCard.getPerson().getPid());
			//entityManager.persist(p);
			System.out.println("Record saved");
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}
}

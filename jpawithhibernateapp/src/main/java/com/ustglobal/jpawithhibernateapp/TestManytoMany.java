package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManytoMany {

	public static void main(String[] args) {
		
	
	Course c1 = new Course();
	c1.setCid(10);
	c1.setCname("JAVA");
	
	Course c2 = new Course();
	c2.setCid(20);
	c2.setCname("SQL");
	
	ArrayList<Course> alCourses = new ArrayList<Course>();
	alCourses.add(c1);
	alCourses.add(c2);
	
	Student s = new Student();
	s.setSid(124);
	s.setSname("shru");
	s.setCourses(alCourses);
	
	
	

	
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
		
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager  = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(s);
		
		System.out.println("Record saved");
		entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}

	
	
	
}	
	


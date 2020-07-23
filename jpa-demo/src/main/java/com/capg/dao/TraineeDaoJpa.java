package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.model.Trainee;

public class TraineeDaoJpa {
	 
	
	
	static EntityManagerFactory emf =
			 Persistence.createEntityManagerFactory("trainee-unit");
	public Trainee addTrainee(Trainee trainee)
	{
		EntityManager em=emf.createEntityManager();
		 EntityTransaction tx=em.getTransaction();
		 tx.begin(); em.persist(trainee); tx.commit(); System.out.println("Added");
		 return trainee;
	}
	public Trainee findTrainee(int id)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		 tx.begin();
		Trainee t1 = em.find(Trainee.class, id);
		tx.commit();
		 if(t1!=null)
		 {
			 return t1;
		 }
		 else
		 {
			 return null;
		 }
	}
	

}

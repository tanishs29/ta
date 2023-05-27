package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.dto;

public class dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	//create
	public void signuppage (dto d1) {
		et.begin();
		em.persist(d1);
		et.commit();
	}

	public dto fetch(String email) {
		dto dto = em.find(dto.class, email);
		return dto;
	}
	
}

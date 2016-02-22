package com.levins.my.contact;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Create a new EntityManagerFactory using the System properties.
        // The "hellojpa" name will be used to configure based on the
        // corresponding name in the META-INF/persistence.xml file
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("contact");
        try {
	     
	        EntityManager em = factory.createEntityManager();
	        Query query = em.createQuery("select m from my_table m");

	        for (Employee m : (List<Employee>) query.getResultList()) {
	            System.out.printf("%s (created on: %s)\n", m); 
	        }	        
	
	        em.close();

		} finally {
			factory.close();
		}

	}

}

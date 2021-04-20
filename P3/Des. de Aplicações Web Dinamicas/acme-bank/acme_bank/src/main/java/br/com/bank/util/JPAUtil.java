package br.com.bank.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	// Se comunica com persistence.xml
	private static EntityManagerFactory factory;
	
	// Padrão Singleton
	public static EntityManagerFactory getEntityManagerFactory() {
		if(factory == null) {
			factory = Persistence.createEntityManagerFactory("ACME");
		}
		
		return factory;
	}
	
	public static void finalFactory() {
		if(factory != null) {
			factory.close();
		}
	}
}

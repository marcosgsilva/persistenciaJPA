package com.marcospaulo.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

	private static final SessionFactory sessionFactory = buidSessionFactory();

	private static SessionFactory buidSessionFactory() {
		try {
			/**
			 * Será responsável por capturar os dados .cfg.xml
			 */
			return new Configuration().configure().buildSessionFactory();

		} catch (Throwable ex) {
			System.err.print(ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	/**
	 * Método para pegar a session Factory
	 * 
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;

	}

	// Método responsável pelo close session factory
	public static void close() {
		getSessionFactory().close();
	}

}

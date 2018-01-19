package com.sankar.hibernate.util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class SessionUtil {
	
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	private static SessionFactory sessionFactory;
	
	static {
		try {
			
			sessionFactory = new Configuration().configure(
					"com/sankar/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private SessionUtil() {
		
	}
	
	public static Session getThreadLocalSession(){
		
		Session session = (Session) threadLocal.get();
		
		if( session == null) {
			session = sessionFactory.openSession();
			threadLocal.set(session);
		}
		
		return session;
		
	}
	
	public static void cloaseThreadLocalSession(){
		
		Session session = (Session) threadLocal.get();
		threadLocal.set(null);
		
		if( session != null) {
			session.close();
		}
	
	}
	
	public static Session getSession() {
		return sessionFactory.openSession();
	}
	
	public static void closeSession(Session session) {
		if(session != null) {
			session.close();
		}
	}

}

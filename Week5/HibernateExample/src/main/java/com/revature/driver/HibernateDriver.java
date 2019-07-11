package com.revature.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.domains.HoneyPot;
import com.revature.util.SessionFactoryUtil;

public class HibernateDriver {

	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public static void main(String[] args) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		HoneyPot hp1 = (HoneyPot) sess.get(HoneyPot.class, 1);
		System.out.println(hp1);
		HoneyPot hp2 = new HoneyPot(-1, 5.5, 10.11);
		sess.save(hp2);
		tx.commit();
		sess.close();
		System.out.println("everything fine");
		sf.close();
	}
	
}

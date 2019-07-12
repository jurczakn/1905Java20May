package com.revature.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.domains.Bear;
import com.revature.util.SessionFactoryUtil;

public class BearDaoImpl {
	
	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public void queryDemo() {
		Session sess = sf.openSession();
		
		String hql = "FROM Bear as b WHERE b.breed = :type";
		
		Query query = sess.createQuery(hql);
		
		query.setParameter("type", "polar");
		
		List<Bear> bears = query.list();
		
		for (Bear b: bears) {
			System.out.println(b);
		}
		
	}

}

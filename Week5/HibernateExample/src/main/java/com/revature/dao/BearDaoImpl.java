package com.revature.dao;

import java.util.List;

import static org.hibernate.criterion.Restrictions.*;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
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
		
		String breed = "polar";
		
		SQLQuery natQuery = sess.createSQLQuery("Select * from bears where breed = " + breed);
		
		natQuery.addEntity(Bear.class);
		
		bears = natQuery.list();
		
		Query query2 = sess.getNamedQuery("get_large_bears");
		
		int amount = 800;
		
		query2.setInteger("amount", amount);
		
		bears = query2.list();
		
	}
	
	public List<Bear> getAllBears() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Bear.class);
		List<Bear> result = crit.list();
		sess.close();
		return result;
	}
	
	public List<Bear> getBearsByBreed(String breed) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(Bear.class).add(eq("breed", breed));
		List<Bear> result = crit.list();
		sess.close();
		return result;
	}
	
	public List<Bear> getBearsByBreedAndWeightLessThan(String breed, int weight) {
		Session sess = sf.openSession();
		/*
		 * Criteria crit = sess.createCriteria(Bear.class) .add(Restrictions.and(
		 * Restrictions.eq("breed", breed), Restrictions.not(Restrictions.lt("weight",
		 * weight)) ));
		 */
		Criteria crit = sess.createCriteria(Bear.class)
				.add(and(
						eq("breed", breed),
						not(lt("weight", weight))
			));
		List<Bear> result = crit.list();
		sess.close();
		return result;
	}

}

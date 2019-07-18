/*
 * package com.revature.daos;
 * 
 * import java.util.List;
 * 
 * import org.hibernate.SessionFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.revature.domains.Cave;
 * 
 * @Component
 * 
 * @Transactional public class CaveDaoImpl implements CaveDao {
 * 
 * @Autowired private SessionFactory mySessionFactory;
 * 
 * @Override public void createCave(Cave cave) {
 * mySessionFactory.getCurrentSession().save(cave); }
 * 
 * @Override public Cave readCave(Integer id) { return
 * mySessionFactory.getCurrentSession().get(Cave.class, id); }
 * 
 * @Override public List<Cave> readAllCaves() { return
 * mySessionFactory.getCurrentSession().createCriteria(Cave.class).list(); }
 * 
 * @Override public void updateCave(Cave cave) {
 * mySessionFactory.getCurrentSession().update(cave); }
 * 
 * @Override public void deleteCave(Cave cave) {
 * mySessionFactory.getCurrentSession().delete(cave); }
 * 
 * }
 */

package com.sunRays;

import java.util.List;
 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository
public class PersonDao {
 
private SessionFactory sessionFactory;
 
public SessionFactory getSessionFactory() {
return sessionFactory;
}
 
@Autowired
public void setSessionFactory(SessionFactory sessionFactory) {
this.sessionFactory = sessionFactory;
}
 
/**Note:
 *  to use @Transactional follow below step
 *  1. remove <current_session_context_class> hibernate property within config XML
 *  2. @Transactional
 *  3. Transaction begin and commit is handled by hibernateTransactionManager
 *  http://docs.spring.io/spring/docs/4.0.x/spring-framework-reference/htmlsingle/#transaction  
 */

@Transactional
public void insert(Person person) {
	Session session = getSessionFactory().getCurrentSession();
	session.saveOrUpdate(person);	
}
@Transactional 
public List<Person> selectAll() {
	return (List<Person>) sessionFactory.getCurrentSession().createCriteria(Person.class).list();
}
//Note: remove <current_session_context_class> hibernate property within config XML 
//public void insert(Person person) {
//
//	Session session = getSessionFactory().getCurrentSession();
//    Transaction tx = null;
//	try {
//        tx = session.beginTransaction();
//        session.save(person);
//        tx.commit();
//    }
//    catch (RuntimeException e) {
//        if (tx != null) tx.rollback();
//        throw e; 
//    }
//}

//	public List<Person> selectAll() {
//		Session session = getSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		Criteria criteria = session.createCriteria(Person.class);
//		List<Person> persons = (List<Person>) criteria.list();
//		session.getTransaction().commit();
//		return persons;
//	}
 
}
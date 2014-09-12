package com.sunRays;

import java.util.List;
 


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository

public class PersonDao {
@Autowired  
private SessionFactory sessionFactory;

public SessionFactory getSessionFactory() {
return sessionFactory;
}
 

public void setSessionFactory(SessionFactory sessionFactory) {
this.sessionFactory = sessionFactory;
}



@Transactional
public void insert(Person person) {
	Session session = getSessionFactory().getCurrentSession();
	session.saveOrUpdate(person);	
}
@Transactional 
public List<Person> selectAll() {
	return (List<Person>) sessionFactory.getCurrentSession().createCriteria(Person.class).list();
}

 
}
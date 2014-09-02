package com.sunRays;

import java.util.List;
 
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
public class PersonDao {
 
private SessionFactory sessionFactory;
 
public SessionFactory getSessionFactory() {
return sessionFactory;
}
public void setSessionFactory(SessionFactory sessionFactory) {
this.sessionFactory = sessionFactory;
}
 
public void insert(Person person){
Session session = getSessionFactory().getCurrentSession();
session.beginTransaction();
session.save(person);
session.getTransaction().commit();
 
}
 
public List<Person> selectAll(){
Session session = getSessionFactory().getCurrentSession();
session.beginTransaction();
Criteria criteria = session.createCriteria(Person.class);
List<Person> persons = (List<Person>)criteria.list();
session.getTransaction().commit();
return persons;
}
 
}

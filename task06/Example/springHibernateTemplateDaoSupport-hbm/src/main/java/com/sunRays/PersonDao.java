package com.sunRays;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PersonDao extends HibernateDaoSupport{
	
	
	public void insert(Person person){
		getHibernateTemplate().save(person);
	}
	
	public List<Person> selectAll(){
		DetachedCriteria criteria = DetachedCriteria.forClass(Person.class);
		return getHibernateTemplate().findByCriteria(criteria);
	}

}

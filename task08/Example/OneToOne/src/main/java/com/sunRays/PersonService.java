package com.sunRays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class PersonService {
@Autowired 
private PersonDao personDao;
 
public PersonDao getPersonDao() {
return personDao;
}
 

public void setPersonDao(PersonDao personDao) {
this.personDao = personDao;
}

public void addPerson(Person person) {
getPersonDao().insert(person);
}
 
public List<Person> fetchAllPersons() {
return getPersonDao().selectAll();
}
}
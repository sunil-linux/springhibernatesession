package com.sunRays;

import java.util.List;

public class PersonService {

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

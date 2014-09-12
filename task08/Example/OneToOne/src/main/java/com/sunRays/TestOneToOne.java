package com.sunRays;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOneToOne {

	public static void main(String[] args) {
		System.out.println("************** BEGINNING PROGRAM **************");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		PersonService personService = (PersonService) context.getBean("personService");
		Address address=new Address();
		address.setAddress("pune");
		
		Person person = new Person();
		person.setName("sun");
		person.setEmail("sun@gmail.com");
		person.setDoj(new Date());
		person.setAddress(address);
		
		personService.addPerson(person);
		System.out.println("Person : " + person + " added successfully");
		
		List<Person> persons = personService.fetchAllPersons();
		System.out.println("The list of all persons = " + persons);
		
		System.out.println("************** ENDING PROGRAM *****************");
	}
}

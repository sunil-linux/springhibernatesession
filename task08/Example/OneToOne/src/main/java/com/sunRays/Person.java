package com.sunRays;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
@Table(name = "PERSON")
public class Person {
	
@Id
@GeneratedValue
private Integer personId;
@Column(name="PersonName")
private String name;
private String email;
@Temporal(TemporalType.DATE)
private Date doj;

@OneToOne(cascade = CascadeType.ALL)
//@JoinColumn(name="addressId")
private Address address;
 


 
@Override
public String toString() {
return "Person [id=" + personId + ", name=" + name + ", email=" + email + "]";
}




public Integer getPersonId() {
	return personId;
}




public void setPersonId(Integer personId) {
	this.personId = personId;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public Date getDoj() {
	return doj;
}




public void setDoj(Date doj) {
	this.doj = doj;
}




public Address getAddress() {
	return address;
}




public void setAddress(Address address) {
	this.address = address;
}


 
}
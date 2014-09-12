package com.sunRays;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
public class Person {
	
@Id
@GeneratedValue
private Integer personId;
@Column(name="PersonName")
private String name;
private String email;
@Temporal(TemporalType.DATE)
private Date doj;


@OneToMany(fetch = FetchType.EAGER,cascade={CascadeType.ALL})
private List<Address> addresses;
 


 
@Override
public String toString() {
return "Person [id=" + personId + ", name=" + name + ", email=" + email + "]\n"+addresses;
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




public List<Address> getAddresses() {
	return addresses;
}




public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
}


 
}
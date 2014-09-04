package com.sunRays;

import java.util.List;
 
import org.springframework.jdbc.core.support.JdbcDaoSupport;
 
public class PersonDao extends JdbcDaoSupport{
 
public void insert(Person person){
String insertSql ="INSERT INTO PERSON (NAME, EMAIL) VALUES(?,?)";
String name = person.getName();
String email = person.getEmail();
 
getJdbcTemplate().update(insertSql,new Object[]{name,email});
 
}
 
public List<Person> selectAll(){
String selectAllSql = "SELECT * FROM PERSON";
return getJdbcTemplate().query(selectAllSql, new PersonRowMapper());
}


 
}
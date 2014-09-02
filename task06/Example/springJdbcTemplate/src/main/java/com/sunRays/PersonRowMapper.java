package com.sunRays;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person>{

	public Person mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		Person person = new Person();
	    person.setName(resultSet.getString(1));
	    person.setEmail(resultSet.getString(2));
	    return person;
	}

}

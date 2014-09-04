Spring provides convenient classes to perform functions on the database. 
1.It handles creating a connection to a database, 
2.performing clean up and 
3.handling exceptions. 

The user creates a datasource and injects it into a jdbctemplate. 
The jdbctemplate is then injected into the spring Dao. 
The user can also inject a datasource directly into the Dao. 
The Dao is an abstract class and the user extends this class to create his own Dao. 

The advantage of this class is that the user does not have to inject the JdbcTemplate into all of his DAO classes. The user creates a common Dao class that can be extended by all the DAO classes. 

Spring provides two DAO classes JdbcDaoSupport and NamedParameterJdbcDaoSupport. There is a third class called SimpleJdbcDaoSupport but this is now deprecated in favor of JdbcDaoSupport and NamedParameterJdbcDaoSupport
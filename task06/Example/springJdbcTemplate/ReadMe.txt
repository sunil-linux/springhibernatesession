Spring Jdbc Template
---------------------
The standard way to access a database using java is to use a JDBC driver. 
The steps involved are 
1.creating or obtaining a connection from a connection pool, 
2.creating a statement, 
3.executing query or update statements and 
4.closing the connection. 
This looks simple, but we need to do this every time, the same steps over and over again in all methods that talk to the database, and we also have to handle the ubiquitous SQLException almost everywhere.

Accessing Data - Our application code talks to a layer called DAO or data access object. The DAO is a layer that sits between our application and the database. The DAO has two main advantages - 
1. Its coded to an interface and 
2. It abstracts the implementation and hence the application need not be aware of the actual database

SQLException - We always have to deal with SQLException when working with JDBC. The exception is thrown in almost all methods, but to get to the root of the problem is very difficult since SQLException does not tell us much about the problem (unless we catch the error code and write scores of if-then statements). Even if we manage to get the problem out of SQLException, it will always be specific to a particular persistence mechanism. 
	Spring provides a hierarchy of Exceptions that cover almost all kinds of exceptions that a database can throw. 
Examples of these are - 
1.DataIntegrityViolationException, 
2.PermissionDeniedDataAccessException, 
3.CannotAcquireLockException etc. 
The other good thing about this exceptions is that they need not be caught. (unchecked exception) No matter what persistence mechanism we use, spring always throws this exception

Templates : Most of the code for database access is repetitive. 
Opening connection, 
closing connection, etc. 
Spring creates templates that handles most of this repetitive code. The developer uses this template which does most of the work and just fills in the logic specific to the application. He does not have to worry about managing connections or exceptions. 
Spring has template for various persistence frameworks such as plain JDBC, Hibernate, iBatis etc. 

DataSource - No matter what technology is used, spring would require the connection info to the persistence mechanism. This connection info is specified in the form of datasource. The datasource needs to be injected in the template. The datasource may also be created by the application server, the developer then uses JNDI to access the datasource.

JdbcTemplate - The JdbcTemplate is the spring answer to plain JDBC access. It handles database connectivity. Users can specify the sql and a callback through its method. The template does the work of creating the connection and executing the query or update. The callback can be used to handle resultset (ResultSetExtractor) or create a prepared statement (PreparedStatementCreator)

RowMapper - RowMapper Interface is used by the JdbcTemplate to map a resultset row. The implementation of this interface maps a resultset row to a result object. The implementation does not have to worry about catching exceptions. Implementations must implement the method 

e.g. T mapRow(ResultSet rs, int rowNum) throws SQLException;

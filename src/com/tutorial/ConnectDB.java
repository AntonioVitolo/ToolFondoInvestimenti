package com.tutorial;
import java.io.Serializable;
import java.sql.*;  



public class ConnectDB {

	/**
	 * 
	 */

	private static Connection connection;
	private static Statement statement ;   
   private static ResultSet resultSet ;  
	
	
	public ConnectDB() {
		super();
		connect();
	}

	public static void connect(){
		String connectionString =  
	            "jdbc:sqlserver://4PLBGC2\\SQLEXPRESS;databaseName=ICBPI_db;integratedSecurity=true;";  
	             

	         // Declare the JDBC objects.  
	          connection = null;  
	          statement = null;   
	          resultSet = null;  

	         try {  
	        	
	        	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
	        	 
	             connection = DriverManager.getConnection(connectionString);  

	             // Create and execute a SELECT SQL statement.  
	             String selectSql = "SELECT *  from Commissioni";  
	             statement = connection.createStatement();  
	             resultSet = statement.executeQuery(selectSql);  

	             // Print results from select statement  
	             while (resultSet.next())   
	             {  
	            	 for(int i=1;i<resultSet.getMetaData().getColumnCount();i++){
	            	 
	                 System.out.println(resultSet.getMetaData().getColumnLabel(i)+": "+resultSet.getString(i));
	                 System.out.println("\n");
	            	 }
	            	 
	            	
	            	break;
	             }  
	         }  
	         catch (Exception e) {  
	             e.printStackTrace();  
	         }  
	         finally {  
	             // Close the connections after the data has been handled.  
	             if (resultSet != null) try { resultSet.close(); } catch(Exception e) {}  
	             if (statement != null) try { statement.close(); } catch(Exception e) {}  
	             if (connection != null) try { connection.close(); } catch(Exception e) {}  
	         }  
		
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		ConnectDB.connection = connection;
	}

	public static Statement getStatement() {
		return statement;
	}

	public static void setStatement(Statement statement) {
		ConnectDB.statement = statement;
	}

	public static ResultSet getResultSet() {
		return resultSet;
	}

	public static void setResultSet(ResultSet resultSet) {
		ConnectDB.resultSet = resultSet;
	}
		
	
	 
     
 }  
 
	
	
	
	
	
	


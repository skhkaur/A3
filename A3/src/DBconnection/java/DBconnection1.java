package DBconnection.java;
import  java.sql.*;
public class DBconnection 
{
	
	public static void main(String[]args) {
   String dbUrl = "jdbc:mysql://localhost:3306/A1";
   String user = "root";
   String password = "";
  try {
	  //1.established the connection
	  Connection myConn = DriverManager.getConnection(dbUrl, user, password);
	  
	  //2.create a statement
	  Statement myStmt = myConn.createStatement();
	  
	  //3. execute the query
	  ResultSet myRs = myStmt.executeQuery("select * from login");
	  
	  //4. process the ResultSet object
	  while(myRs.next()) {
		  System.out.println(myRs.getInt("lblNewLabel")+ " " + myRs.getString("lblNewLabel_1"));
		  }
	  myStmt.close();
	  myConn.close();
	 
  }catch(Exception e){
	  e.printStackTrace();
	  }
	}
	}
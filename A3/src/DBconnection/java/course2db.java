package DBconnection.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class course2db {
	 /**
	  * @param args
	  */
	 public static void main (String[] args) {
		 String dbUrl = "jdbc:mysql://localhost:3306/s1";
		   String user = "root";
		   String password = "";
		   try
			 {
				  Connection myConn = DriverManager.getConnection(dbUrl, user, password);
				  
				  //2.create a statement
				  Statement myStmt = myConn.createStatement();
				 String sql1="SELECT * FROM s1.course2";
			ResultSet rs1=myStmt.executeQuery(sql1);
			while(rs1.next())
				System.out.println(rs1.getInt("StudentID")+ "  "+ rs1.getString("Instructor")+ "  "+ rs1.getString("Day")+"  "+ rs1.getString("Time"));
			myConn.close();
			 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 // TODO Auto-generated method stub
			 }
		
}
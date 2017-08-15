package DBconnection.java;

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.Statement;
 
 public class logindb {
	 /**
	  * @param args
	  */
	 public static void main (String[] args) {
		 // TODO Auto-generated method stub
		 try
		 {
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost")
					 //System.out.println("Connection success");
		Statement st=con.createStatement();
		String sql1="select*from login_db";
		ResultSet rs1=st.executeQuery(sql1);
		while(rs1.next())
			System.out.println("Student ID:"+rs1.getString("Student_ID")+"/nPassword:"+rs1.getString("Password"));
			con.close();
		 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 // TODO Auto-generated method stub
		 }
	 }
 
	



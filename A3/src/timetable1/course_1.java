package timetable1;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JTextField;

public class course_1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					course_1 frame = new course_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public course_1() throws SQLException {
		

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel.setBounds(58, 85, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Instructor");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(58, 128, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Day");
		lblNewLabel_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(79, 165, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Time");
		lblNewLabel_3.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(58, 206, 72, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Course 1");
		lblNewLabel_4.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(125, 37, 93, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel stdIdlbl = new JLabel("");
		stdIdlbl.setBounds(172, 85, 115, 15);
		contentPane.add(stdIdlbl);
		
		JLabel instructorlbl = new JLabel("");
		instructorlbl.setBounds(172, 127, 115, 15);
		contentPane.add(instructorlbl);
		
		JLabel daylbl = new JLabel("");
		daylbl.setBounds(172, 165, 115, 15);
		contentPane.add(daylbl);
		
		JLabel timelbl = new JLabel("");
		timelbl.setBounds(172, 206, 115, 15);
		contentPane.add(timelbl);

		//*******************************
		ResultSet myresultset=null;
		PreparedStatement prepstmt;
		Connection myDBconnection =null;
		int studentID;
		String name;
		
		
myDBconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/s1","root","");
		
	    System.out.println("Connected to DB");
	    	    
	    String sqlQuery=("SELECT * FROM s1.course1"); // ensure that your schema name is correct.
	    
		 prepstmt = (PreparedStatement) myDBconnection.prepareStatement(sqlQuery);
		 					 		 
		 myresultset= prepstmt.executeQuery();
												 
		 while(myresultset.next()){
																									 
			if(myresultset.getString("StudentID").equals("1")){
				
				studentID=myresultset.getInt("StudentID");
				stdIdlbl.setText(String.valueOf(studentID));
							
														 				 				 				 			 
		 }
			
if(myresultset.getString("Instructor").equals("CHARLIE")){
				
	            name=myresultset.getString("Instructor");
	            instructorlbl.setText(String.valueOf(name));
			
			
		 }

if(myresultset.getString("Day").equals("MONDAY")){
	
    name=myresultset.getString("Day");
    daylbl.setText(String.valueOf(name));


}

if(myresultset.getString("Time").equals("12")){
	
    name=myresultset.getString("Time");
    timelbl.setText(String.valueOf(name));


}
		
		
				
		
}
	
	}}

		 
	
	
			
		
		
		


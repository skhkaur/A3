package DBconnection.java;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;

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
	 */
	public course_1() {
		

			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel.setBounds(37, 85, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Instructor");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(37, 126, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Day");
		lblNewLabel_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(37, 164, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Time");
		lblNewLabel_3.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(37, 205, 72, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Course 1");
		lblNewLabel_4.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(125, 37, 93, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(151, 86, 164, 31);
		contentPane.add(lblNewLabel_5);
			
		
		String dbUrl = "jdbc:mysql://localhost:3306/a1";
		   String user = "root";
		   String password = "";
		 // TODO Auto-generated method stub
		 try
		 {
			  Connection myConn = DriverManager.getConnection(dbUrl, user, password);
			  
			  //2.create a statement
			  Statement myStmt = myConn.createStatement();
			 String sql1="SELECT * FROM a1.`course2`";
		ResultSet rs1=myStmt.executeQuery(sql1);
		while(rs1.next()) 
			System.out.println(rs1.getInt("Student ID")+ "  "+ rs1.getString("Instructor")+ "  "+ rs1.getString("Day")+"  "+ rs1.getString("Time"));
	
		if(rs1.getString("Instructor").equals("fff")) {
			
			String instrct=rs1.getString("Instructor");
			lblNewLabel_5.setText("fff");	
			
			
		}
				
		
		myConn.close();
		 }
		 
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
		
	}
}

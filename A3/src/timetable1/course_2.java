package timetable1;

import java.awt.BorderLayout;
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
import java.sql.SQLException;
import java.awt.Color;

public class course_2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					course_2 frame = new course_2();
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
        public course_2() throws SQLException {

	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENTID");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel.setBounds(50, 83, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INSTRUCTOR");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(50, 160, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DAY");
		lblNewLabel_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(50, 200, 83, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TIME");
		lblNewLabel_3.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(50, 120, 83, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Course 2");
		lblNewLabel_4.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(139, 31, 102, 14);
		contentPane.add(lblNewLabel_4);
		
		
	
        JLabel stdIdlbl = new JLabel("");
        stdIdlbl.setBounds(172, 85, 115, 15);
        contentPane.add(stdIdlbl);

       JLabel instructorlbl = new JLabel("");
       instructorlbl.setBounds(182, 120, 115, 15);
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
       String name2;


     myDBconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/s1","root","");

    System.out.println("Connected to DB");
	    
    String sqlQuery=("SELECT * FROM s1.course2"); // ensure that your schema name is correct.

   prepstmt = (PreparedStatement) myDBconnection.prepareStatement(sqlQuery);
 					 		 
   myresultset= prepstmt.executeQuery();
										 
   while(myresultset.next()){
																							 
	  if(myresultset.getString("StudentID").equals("2")){
		
		studentID=myresultset.getInt("STUDENTID");
		stdIdlbl.setText(String.valueOf(studentID));
					
												 				 				 				 			 
   }
	
    if(myresultset.getString("instructor").equals("MESA")){
		
        name2=myresultset.getString("Instructor");
        instructorlbl.setText(String.valueOf(name2));
	
	
 }

    if(myresultset.getString("Day").equals("TUESDAY")){

     name2=myresultset.getString("Day");
     daylbl.setText(String.valueOf(name2));


}

   if(myresultset.getString("Time").equals("14:00")){

   name2=myresultset.getString("Time");
   timelbl.setText(String.valueOf(name2));


}


		

}

}}

 


	


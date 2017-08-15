package DBconnection.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class courses extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					courses frame = new courses();
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
	public courses() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCourse = new JButton("Course 1");
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				course_1 cor = new course_1();
				cor.setVisible(true);
			}
		});
		btnCourse.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCourse.setBounds(79, 64, 125, 23);
		contentPane.add(btnCourse);
		
		JButton btnCourse_1 = new JButton("Course 2");
		btnCourse_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCourse_1.setBounds(79, 115, 125, 23);
		contentPane.add(btnCourse_1);
		btnCourse_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			contentPane.setVisible(false);
			course_2 cor = new course_2();
			cor.setVisible(true);
		}
		});
		
		JButton btnCourse_2 = new JButton("Course 3");
		btnCourse_2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCourse_2.setBounds(79, 168, 125, 23);
		contentPane.add(btnCourse_2);
		btnCourse_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			contentPane.setVisible(false);
			course_3 cor = new course_3();
			cor.setVisible(true);
		}
		});
		
		JButton btnCourse_3 = new JButton("Course 4");
		btnCourse_3.setFont(new Font("Monospaced", Font.PLAIN, 13));
		btnCourse_3.setBounds(79, 214, 125, 23);
		contentPane.add(btnCourse_3);
		btnCourse_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				course_4 cor = new course_4();
				cor.setVisible(true);
			}
			});
		
		JLabel lblNewLabel = new JLabel("Courses ");
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblNewLabel.setBounds(171, 22, 97, 14);
		contentPane.add(lblNewLabel);
	}
		}

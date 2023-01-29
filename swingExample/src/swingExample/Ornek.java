package swingExample;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ornek {
	private static JTextField txtEnterTheFirst;
	private static JTextField txtSecondNumber;
	private static JTextField txtRe;
	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(10, 136, 47, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(63, 136, 47, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(116, 136, 47, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(10, 176, 47, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(63, 176, 47, 29);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(116, 176, 47, 29);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(10, 216, 47, 29);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(63, 216, 47, 29);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBounds(116, 216, 47, 29);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setBounds(10, 256, 47, 29);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("ADD");
		btnNewButton_9_1.setBounds(207, 136, 92, 28);
		frame.getContentPane().add(btnNewButton_9_1);
		
		JButton btnNewButton_9_1_1_1 = new JButton("SUBSTRACT");
		btnNewButton_9_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9_1_1_1.setBounds(207, 175, 92, 29);
		frame.getContentPane().add(btnNewButton_9_1_1_1);
		
		JButton btnNewButton_9_1_1_1_1 = new JButton("MULTIPLE");
		btnNewButton_9_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9_1_1_1_1.setBounds(207, 215, 92, 29);
		frame.getContentPane().add(btnNewButton_9_1_1_1_1);
		
		JButton btnNewButton_9_1_1_1_1_1 = new JButton("DIVISE");
		btnNewButton_9_1_1_1_1_1.setBounds(207, 258, 92, 29);
		frame.getContentPane().add(btnNewButton_9_1_1_1_1_1);
		
		txtEnterTheFirst = new JTextField();
		txtEnterTheFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) { txtEnterTheFirst.setText("1");
					}
				
			
		});
		txtEnterTheFirst.setText("First Number");
		txtEnterTheFirst.setBounds(10, 11, 159, 34);
		frame.getContentPane().add(txtEnterTheFirst);
		txtEnterTheFirst.setColumns(10);
		
		txtSecondNumber = new JTextField();
		txtSecondNumber.setText("Second Number");
		txtSecondNumber.setColumns(10);
		txtSecondNumber.setBounds(10, 56, 159, 34);
		frame.getContentPane().add(txtSecondNumber);
		
		txtRe = new JTextField();
		txtRe.setText("Result");
		txtRe.setColumns(10);
		txtRe.setBounds(207, 11, 168, 72);
		frame.getContentPane().add(txtRe);
		
		

		
		
	}
}

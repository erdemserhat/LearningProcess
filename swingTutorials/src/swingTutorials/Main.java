package swingTutorials;

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	
	public static void main(String [] args) {
		/*
		// JFrame = a GUI ( Graphical User Interface ) to add components to, you can add any components thanks to JFrame
		
		JFrame frame = new JFrame(); 
		// creates an instance of JFrame class, you can also overload this consturctor.
		// to use JFrame class, you have to import "import javax.swing.JFrame;"
		//in this code line, if you initialize project you will not see a windows 'cause visibility of frame was set as
		// unvisible in default, that's why you should set as visible with the code below
		frame.setVisible(true);
		//make frame visible
		//in this code line, if you initialize project, you will see windows too small 'cause we didn't set size..
		frame.setSize(420,420);// width and high..
		// this sets the x-dimension, and y-dimesion of frame..
		frame.setTitle("JFrame title  for SENG TURKEY");
		// this sets title of frame..
		
		// When we touch the exit button in the project, this will hide from us but not actually exit.
		// if we want to close out of the application and make it exit we should do this..
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
		//normally we can resize our windows easily, but we don't want;
		frame.setResizable(false); //prevent frame from being resized..
		// how can we change frame icon ??? (java logo)
		ImageIcon image = new ImageIcon("png.PNG");
		// Firstly, you should craeate and instance of ImageIcon class and you should paste your image file to project file.
		//create an image icon.
		frame.setIconImage(image.getImage());// change icon of frame..
		frame.getContentPane().setBackground(Color.red); // change color of backgorund.
		frame.getContentPane().setBackground(new Color(0,0,0)); // change color of background by RGB values.
		frame.getContentPane().setBackground(new Color(0xFFFFFF));// change color of backround by hexadecimal values.
		
		
		
		
		
		*/
		
		
		//MyFrame frame = new MyFrame();
		
		
		
		//JLabel = a GUI display area for a string of text, an image, or both.
		
		ImageIcon image = new ImageIcon("icon.PNG");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel(); // creates a label
		label.setText("This is a example text ...");// set text of label..
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER,RIGHT of imageicon.
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER,BOTTOM of image.
		label.setForeground(Color.green); // set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN,50)); // set font of text
		label.setIconTextGap(-25);//set gap of text to image.
		label.setBackground(Color.white);// set background color
		label.setOpaque(true); // make possible to display background color
		label.setBorder(border);// set border with using border value.
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of image +text
		label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position of image+ text within label
		//label.setBounds(50,50,500,500);//set x,y position within frame as well as dimesions
		
		
		
		JFrame frame = new JFrame ();
		frame.setVisible(true);
		//frame.setSize(600,600);*
		//frame.setLayout(null);//****
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.pack();//*
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

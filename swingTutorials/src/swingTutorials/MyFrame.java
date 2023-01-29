package swingTutorials;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	
	// JFrame = a GUI ( Graphical User Interface ) to add components to, you can add any components thanks to JFrame
	
			MyFrame(){
				
			
				// creates an instance of JFrame class, you can also overload this consturctor.
				// to use JFrame class, you have to import "import javax.swing.JFrame;"
				//in this code line, if you initialize project you will not see a windows 'cause visibility of this was set as
				// unvisible in default, that's why you should set as visible with the code below
				this.setVisible(true);
				//make this visible
				//in this code line, if you initialize project, you will see windows too small 'cause we didn't set size..
				this.setSize(420,420);// width and high..
				// this sets the x-dimension, and y-dimesion of this..
				this.setTitle("JFrame title  for SENG TURKEY");
				// this sets title of this..
				
				// When we touch the exit button in the project, this will hide from us but not actually exit.
				// if we want to close out of the application and make it exit we should do this..
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
				//normally we can resize our windows easily, but we don't want;
				this.setResizable(false); //prevent this from being resized..
				// how can we change this icon ??? (java logo)
				ImageIcon image = new ImageIcon("png.PNG");
				// Firstly, you should craeate and instance of ImageIcon class and you should paste your image file to project file.
				//create an image icon.
				this.setIconImage(image.getImage());// change icon of this..
				this.getContentPane().setBackground(Color.red); // change color of backgorund.
				this.getContentPane().setBackground(new Color(0,0,0)); // change color of background by RGB values.
				this.getContentPane().setBackground(new Color(0xFFFFFF));// change color of backround by hexadecimal values.
			}
			//26:55

}

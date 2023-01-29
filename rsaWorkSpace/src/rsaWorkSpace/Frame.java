package rsaWorkSpace;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
	
	Frame(){
		
		this.setVisible(true);
		this.setSize(420,420);
		this.setTitle("RSA TEXT ENCRYTOR");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		ImageIcon icon = new ImageIcon("icon.PNG");
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(Color.white);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				syso
			}
		});
		getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		
		
		
		
		
		
		
		
		
	}

}

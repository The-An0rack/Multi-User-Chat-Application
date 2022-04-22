package com.dewashishmehta.chatapp.views;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserView extends JFrame{
	int counter;
	public UserView() {
		counter = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set functionality of 'X' button
		setSize(400,400); //Set Default size of the window
		setResizable(false); //false-> Window cannot be resized
		setTitle("Login - ChatApp"); //Assign Title to the window
		setLocationRelativeTo(null); //Always makes window open in center of the screen
		//setLocation(100,300);
		
		
		JLabel welcome = new JLabel("Login"); //JLabel is labeling text
		welcome.setFont(new Font("Arial",Font.BOLD,40));
		welcome.setBounds(120,10,200,200); // x,y,length, height
		Container container = this.getContentPane(); //fetches container
		container.setLayout(null); //sets layout so that label can be inserted in container's coordinate space
		container.add(welcome); //adds welcome label to container
		
		JButton button = new JButton("Count"); //Create a button
		button.setBounds(100,300,200,50); //Set button coordinates and layout
		button.addActionListener(new ActionListener() { //Creating an action listener for button (created an anonymus class)
			@Override
			public void actionPerformed(ActionEvent event) { //consists of statements to be executed when button is clicked
				counter++;
				welcome.setText("Count: " + counter); // used to alter pre-set text
			}
		});
		container.add(button);
		setVisible(true); //Makes window visible 
	}
	public static void main(String[] args) {
		UserView userView = new UserView();
	}
}

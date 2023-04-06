package Eventdriven;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Eventdriven
{

		public static void main(String[] args) 
		{
			
			JFrame frame = new JFrame("Eevent-Driven game");
			
			frame.setSize(500, 300);
			
			frame.setVisible(true);
			frame.setLayout(null); 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Font titleFont = new Font("Arial", Font.BOLD, 16);
			
			JLabel label = new JLabel ("Truth or Dare??");
			
			label.setBounds(190,20,290,30);   
			label.setFont(titleFont);
			frame.add(label);

			Font buttonsFont = new Font("Arial", Font.ITALIC, 16);

			JButton button1 = new JButton("Truth");
			button1.setBounds(50, 50, 150, 50);
			button1.setFont(buttonsFont);
			button1.setForeground(Color.white);
			button1.setBackground(Color.black);
			frame.add(button1);

			button1.addActionListener(new ActionListener()
			{
				
				@Override
				public void actionPerformed(ActionEvent e)
				{
					JOptionPane.showMessageDialog(null, "You have chosen truth, have you ever cheatedd on a test?");
					
				}
			});
			
			JButton button2 = new JButton ("Dare");
			button2.setBounds(300, 50, 150, 50);
			button2.setFont(buttonsFont);
			button2.setForeground(Color.black);
			button2.setBackground(Color.white);
			frame.add(button2);

			button2.addActionListener(new ActionListener()
			{
				
				@Override
				public void actionPerformed(ActionEvent e)
				{
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "You have chosen dare, i dare you to do 10 pushups.");
				
				}} );	
}
}
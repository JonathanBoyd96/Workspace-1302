//********************************************************************
//  DotsRebound.java       Author: Dr. Payne
//
//  Demonstrates mouse events.
//********************************************************************

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class DotsRebound
{
	private static JTextField textField;
	private static DotsReboundPanel myDots;
	private static JTextField textField2;
   //-----------------------------------------------------------------
   //  Creates and displays the application frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      myDots = new DotsReboundPanel();
	   JFrame frame = new JFrame ("Dots");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      DotsReboundPanel dotsReboundPanel = new DotsReboundPanel();
      frame.getContentPane().add (myDots);
      
      JPanel panel = new JPanel();
      FlowLayout flowLayout = (FlowLayout) panel.getLayout();
      frame.getContentPane().add(panel, BorderLayout.NORTH);
      
      JLabel lblRadius = new JLabel("Radius");
      panel.add(lblRadius);
      
      textField = new JTextField();
      textField.setText("15");
      panel.add(textField);
      textField.setColumns(4);
      
      JButton btnChange = new JButton("Change");
      btnChange.addActionListener(new ActionListener() {
      	
    	  public void actionPerformed(ActionEvent arg0) 
      	{
      		//call set radius method
      		int radius = Integer.parseInt(textField.getText());
      		myDots.setRadius(radius);
      	}
      });
      panel.add(btnChange);
      
      JPanel panel_1 = new JPanel();
      frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
      
      JLabel lblDelay = new JLabel("Delay");
      panel_1.add(lblDelay);
      
      textField2 = new JTextField();
      textField2.setText("10");
      panel_1.add(textField2);
      textField2.setColumns(4);
      
      JButton btnChange_1 = new JButton("Change");
      btnChange_1.addActionListener(new ActionListener() {
      	
    
    	  public void actionPerformed(ActionEvent e) 
      	{
      		int delay = Integer.parseInt(textField2.getText());
      		myDots.setDelay(delay);
      	}
      });
      panel_1.add(btnChange_1);

      frame.pack();
      frame.setVisible(true);
   }
}

// ******************************************************************
// CirclePanel.java
// Jonathan Boyd
//
// A panel with a circle drawn in the center and buttons on the
// bottom that move the circle.
// ******************************************************************
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class CirclePanel extends JPanel
{
	JButton left;
	JButton right;
	JButton up;
	JButton down;
	JPanel buttonPanel;
	private final int CIRCLE_SIZE = 50;
	private int x, y;
	public Color c;
	int panelWidth, panelHeight;
	public JComboBox color;
	
	//---------------------------------------------------------------
	// Set up circle and buttons to move it.
	//---------------------------------------------------------------
	public CirclePanel(int width, int height)
	{	
		final int title_bar_width = 25;
		final int border_width = 10;
		
		panelWidth = width - 2* border_width;
		panelHeight = height - border_width - title_bar_width;
		
		// Set coordinates so circle starts in middle
		x = (width/2)-(CIRCLE_SIZE/2);
		y = (height/2)-(CIRCLE_SIZE/2);
		c = Color.green;
		
		// Need a border layout to get the buttons on the bottom
		this.setLayout(new BorderLayout());
		// Create buttons to move the circle
		
		left = new JButton("Left");
		left.setMnemonic('a');
		left.setToolTipText("Moves Left 20 Pixels");
		
		right = new JButton("Right");
		right.setMnemonic('d');
		right.setToolTipText("Moves Right 20 Pixels");
		
		up = new JButton("Up");
		up.setMnemonic('w');
		up.setToolTipText("Moves Up 20 Pixels");

		down = new JButton("Down");
		down.setMnemonic('s');
		down.setToolTipText("Moves Down 20 Pixels");
		
		// Add listeners to the buttons
		left.addActionListener(new MoveListener(-20, 0));
		right.addActionListener(new MoveListener(20, 0));
		up.addActionListener(new MoveListener(0, -20));
		down.addActionListener(new MoveListener(0, 20));
		// Need a panel to put the buttons on or they'll be on
		// top of each other.
		buttonPanel = new JPanel();
		buttonPanel.add(left);
		buttonPanel.add(right);
		buttonPanel.add(up);
		buttonPanel.add(down);
		// Add the button panel to the bottom of the main panel
		this.add (buttonPanel, "South");
		
		color = new JComboBox();
		color.addItem("Orange");
		color.addItem("Green");
		color.addItem("Yellow");
		color.addItem("Red");
		color.addActionListener(new ComboListener());
		add(color, BorderLayout.NORTH);
	}
	//----------------------------------------------------------------
	// Draw circle on CirclePanel
	//----------------------------------------------------------------
	public void paintComponent(Graphics page)
	{

		super.paintComponent(page);
		page.setColor(c);
		page.fillOval(x,y, CIRCLE_SIZE, CIRCLE_SIZE);
	}
	//----------------------------------------------------------------
	// Class to listen for button clicks that move circle.
	//----------------------------------------------------------------
	private class MoveListener implements ActionListener
	{
		private int dx;
		private int dy;
		//----------------------------------------------------------------
		// Parameters tell how to move circle at click.
		//----------------------------------------------------------------
		public MoveListener(int dx, int dy)
		{
			this.dx = dx;
			this.dy = dy;
		}
		//----------------------------------------------------------------
		// Change x and y coordinates and repaint.
		//----------------------------------------------------------------
		public void actionPerformed(ActionEvent e)
		{
			x += dx;
			y += dy;
			
			if(x<=0)
				left.setEnabled(false);
			else
				left.setEnabled(true);
			
			if(x>=340)
				right.setEnabled(false);
			else
				right.setEnabled(true);
			
			if(y<=10)
				up.setEnabled(false);
			else
				up.setEnabled(true);
			
			if(y>=175)
				down.setEnabled(false);
			else
				down.setEnabled(true);
			
			repaint();
		}
	}
	
	private class ComboListener implements ActionListener
	{
		public void actionPerformed (ActionEvent event)
		{
			String myColor = (String) color.getSelectedItem();
			
			if (myColor == "Orange")
				c = Color.orange;
			
			if (myColor == "Green")
				c = Color.green;
			
			if (myColor == "Yellow")
				c = Color.yellow;
			
			if (myColor == "Red")
				c = Color.red;
			
			repaint();
		}			
		
	}
}
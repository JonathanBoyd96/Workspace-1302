// DotsPanel.java
// by Jonathan Boyd
// CSCI 1302
// Project Two
// March 1st 2015


import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.*;

public class DotsPanel extends JPanel
{
	private int SIZE = 6;  // radius of each dot
	private Timer timer; // timer for our animation
	private int DELAY = 33; // 30 fps, 33 ms delay
	private int[] xvel = new int[1000], yvel = new int[1000];
	private int[] xvel2 = new int[1000], yvel2 = new int[1000];
	private Color[] col = new Color[1000];
	private ArrayList<Point> pointList;
	private ArrayList<Point> pointList2;
	private ArrayList<Integer> sizes;
	private ArrayList<Color>   color;
	private Color paintColor;
	
	
	//-----------------------------------------------------------------
	//  Constructor: Sets up this panel to listen for mouse events.
	//-----------------------------------------------------------------
	public DotsPanel()
	{
		 for (int i=0; i < 1000; i++)
	     {
	      xvel[i] = (int) (Math.random()*10-5);// random velocity between
	      yvel[i] = (int) (Math.random()*10-5);
	      if (xvel[i]==0)
	    	  xvel[i]=1;
	      if (yvel[i]==0)
	    	  yvel[i]=1;
	      
	      xvel2[i] = (int) (Math.random()*10-5);
	      yvel2[i] = (int) (Math.random()*10-5);
	      if (xvel2[i]==0)
	    	  xvel2[i]=1;
	      if (yvel2[i]==0)
	    	  yvel2[i]=1;
	      
	      col[i] = new Color(
	         		(int)(Math.random()*255),
	         		(int)(Math.random()*255),
	         		(int)(Math.random()*255),
	         		(int)(Math.random()*255));
	     }
		pointList = new ArrayList<Point>();
		pointList2 = new ArrayList<Point>();
		sizes = new ArrayList<Integer>();
		color = new ArrayList<Color>();
		timer = new Timer (DELAY, new DotTimeListener()); // create timer
		addMouseListener (new DotsListener());
		addMouseMotionListener (new DotsListener());
		addMouseWheelListener (new DotsListener());
		setBackground(Color.WHITE);
		paintColor= Color.GREEN;
		setPreferredSize(new Dimension(400, 400));
	    timer.start();
	}
	//-----------------------------------------------------------------
	//  Draws all of the dots stored in the list.
	//-----------------------------------------------------------------
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);

		page.setColor(Color.green);
		for (int i =0; i<pointList.size();i++)
		{
			page.setColor(col[i]);
			page.fillRect(pointList.get(i).x-sizes.get(i), pointList.get(i).y-sizes.get(i), sizes.get(i)*2, sizes.get(i)*2);
		}
		
		for (int i =0; i<pointList2.size();i++)
		{
			page.setColor(col[i]);
			page.fillOval(pointList2.get(i).x-sizes.get(i), pointList2.get(i).y-sizes.get(i), sizes.get(i)*2, sizes.get(i)*2);
		}
		
		
		
		page.setColor(Color.BLACK);
		page.drawString("Count: " + pointList.size(), 5, 15);
		page.drawString("Size: " + SIZE, 5, 30);
		//drawSquares(page);
	}
	//public void drawSquares(Graphics page)
	//{
	//	page.setColor(Color.GREEN);
	//	page.fillRect(0, 300, 100, 100);
	//	page.setColor(Color.ORANGE);
	//	page.fillRect(100, 300, 100, 100);
	//	page.setColor(Color.WHITE);
	//	page.fillRect(200, 300, 100, 100);  
	//	page.setColor(Color.CYAN); 
	//	page.fillRect(300, 300, 100, 100);
	//	   
	//}

	//*****************************************************************
	//  Represents the listener for mouse events.
	//*****************************************************************
	private class DotsListener implements MouseListener,MouseMotionListener,MouseWheelListener
	{
		//--------------------------------------------------------------
		//  Adds the current point to the list of points and redraws
		//  the panel whenever the mouse button is pressed.
		//--------------------------------------------------------------
		public void mousePressed(MouseEvent event)
		{
			if(event.getX() >= 0 && event.getX() <= 100 && event.getY() >= 300 && event.getY() <= 400)
	    	{
	    		paintColor = Color.GREEN;
	    		pointList.add(event.getPoint());
	    		sizes.add(SIZE);
	    		repaint();
	     	}
	    	else if(event.getX() >= 100 && event.getX() <= 200 && event.getY() >= 300 && event.getY() <= 400)
	    	{
	    		paintColor = Color.ORANGE;
	    		pointList.add(event.getPoint());
	    		sizes.add(SIZE);
	    		repaint();
	    	}
	    	else if(event.getX() >= 200 && event.getX() <= 300 && event.getY() >= 300 && event.getY() <= 400)
	    	{
	    		paintColor = Color.WHITE;
	    		pointList.add(event.getPoint());
	    		sizes.add(SIZE);
	    		repaint();
	    	}
	    	else if(event.getX() >= 300 && event.getX() <= 400 && event.getY() >= 300 && event.getY() <= 400)
	    	{
	    		paintColor = Color.CYAN;
	    		pointList.add(event.getPoint());
	    		sizes.add(SIZE);
	    		repaint();
	    	}
			
			
	    	else if (SwingUtilities.isRightMouseButton(event))
			{
	    		pointList2.add(event.getPoint());
	    		sizes.add(SIZE);
	    		repaint();
				
			}
	    	
			if (SwingUtilities.isLeftMouseButton(event))
			{
				pointList.add(event.getPoint());
				sizes.add(SIZE);
				repaint();
			}
	    	color.add(paintColor);
	    	repaint();
			
		}

		//--------------------------------------------------------------
		//  Provide empty definitions for unused event methods.
		//--------------------------------------------------------------
		public void mouseClicked(MouseEvent event) {}
		public void mouseReleased(MouseEvent event) {}
		public void mouseEntered(MouseEvent event) {}
		public void mouseExited(MouseEvent event) {}

		@Override
		public void mouseDragged(MouseEvent e) {
	
			  for (int i=0; i<pointList.size();i++)
			  {
				  pointList.get(i).x = e.getX();
				  pointList.get(i).y = e.getY();
			  }
			  
			  for (int i=0; i<pointList2.size();i++)
			  {
				  pointList2.get(i).x = e.getX();
				  pointList2.get(i).y = e.getY();
			  }
			
			  pointList.add(e.getPoint());
			  color.add(paintColor);
			  sizes.add(SIZE);
			  repaint();
			  
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int notches=e.getWheelRotation();
			if (notches<0)
			{
				SIZE++;
			}
			else 
			{
				SIZE--;
			}
			repaint();
		}
	}
	private class DotTimeListener implements ActionListener
	{
	  //--------------------------------------------------------------
	  //  Move the dots in the pointList
	  //--------------------------------------------------------------
	  public void actionPerformed (ActionEvent event)
	  {
		  for (int i =0; i<pointList.size();i++)
		  {
			  pointList.get(i).x += xvel[i];
			  pointList.get(i).y += yvel[i];

			  //bounce my dots around
			  if ((pointList.get(i).x+SIZE)>getWidth() || pointList.get(i).x<0)
				  xvel[i] = -xvel[i];
			  if (pointList.get(i).y>getHeight() || pointList.get(i).y<0)
				  yvel[i] = -yvel[i];
		  }
		  
		  for (int i =0; i<pointList2.size();i++)
			{
			pointList2.get(i).x += xvel2[i];
			pointList2.get(i).y += yvel2[i];

		
			if ((pointList2.get(i).x+SIZE)>getWidth() || pointList2.get(i).x<0)
			xvel2[i] = -xvel2[i];
			if (pointList2.get(i).y>getHeight() || pointList2.get(i).y<0)
			yvel2[i] = -yvel2[i];
			}

	     repaint();
	  }
	}
	
}


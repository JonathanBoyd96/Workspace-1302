// DotsPanel.java
// by Jonathan Boyd
// CSCI 1302
// Project One
// Febuary 5th 2015

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.*;

public class DotsPanel extends JPanel
{
   private int SIZE = 6;  // radius of each dot
   private ArrayList<Point> pointList;
   private ArrayList<Integer> sizeList;
   private ArrayList<Color> colorList;
   private Color color;
  

   //-----------------------------------------------------------------
   //  Constructor: Sets up this panel to listen for mouse events.
   //-----------------------------------------------------------------
   public DotsPanel()
   {
	   sizeList = new ArrayList<Integer>();
      pointList = new ArrayList<Point>();
      colorList = new ArrayList<Color>();
      
      DotsListener listener = new DotsListener();

      addMouseListener (listener);
      addMouseMotionListener (listener);
      addMouseWheelListener (listener);

      setBackground(Color.black);
      setPreferredSize(new Dimension(500, 500));
      color = Color.BLUE;
   }

   //-----------------------------------------------------------------
   //  Draws all of the dots stored in the list.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);

      for (Point spot : pointList)
    	  for (int i = 0; i < pointList.size(); i++)
    	  {
    		  page.setColor(colorList.get(i));
    		  page.fillRect(pointList.get(i).x-sizeList.get(i), pointList.get(i).y-sizeList.get(i),sizeList.get(i)*2, sizeList.get(i)*2);
    		  
    	  }
      page.setColor(Color.WHITE);
      page.drawString("Count: " + pointList.size(), 5, 15);
      page.drawString("Size: " + SIZE, 5,30);
      
      drawSquares(page);
   }
   
   public void drawSquares(Graphics page)
   {
	   page.setColor(Color.BLUE);
	   page.fillRect(0, 375, 125, 125);
	   
	   page.setColor(Color.GREEN);
	   page.fillRect(125, 375, 125, 125);
	   
	   page.setColor(Color.ORANGE);
	   page.fillRect(250, 375, 125, 125);
	   
	   page.setColor(Color.WHITE);
	   page.fillRect(375, 375, 125, 125);
	   
	}

   //*****************************************************************
   //  Represents the listener for mouse events.
   //*****************************************************************
   private class DotsListener implements MouseListener, MouseMotionListener, MouseWheelListener
   {
      //--------------------------------------------------------------
      //  Adds the current point to the list of points and redraws
      //  the panel whenever the mouse button is pressed.
      //--------------------------------------------------------------
      public void mousePressed(MouseEvent event)
      {
    	  if(event.getX() >= 0 && event.getX() <= 125 && event.getY() >= 375 && event.getY() <= 500)
      	{
      		color = Color.BLUE;
       	}
      	else if(event.getX() >= 125 && event.getX() <= 250 && event.getY() >= 375 && event.getY() <= 500)
      	{
      		color = Color.GREEN;
      	}
      	else if(event.getX() >= 250 && event.getX() <= 375 && event.getY() >= 375 && event.getY() <= 500)
      	{
      		color = Color.ORANGE;
      	}
      	else if(event.getX() >= 375 && event.getX() <= 500 && event.getY() >= 375 && event.getY() <= 500)
      	{
      		color = Color.WHITE;
      	}
    	  sizeList.add(SIZE);
    	  colorList.add(color);
         pointList.add(event.getPoint());
         repaint();
         
      }

      //--------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //--------------------------------------------------------------
      public void mouseClicked(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
   
   
   public void mouseDragged(MouseEvent event) 
   {
	   sizeList.add(SIZE);
	   colorList.add(color);
	pointList.add(event.getPoint());
	   repaint();
		
	}
   
	public void mouseMoved(MouseEvent e) 
	{

		int currentX = e.getX();
		int currentY = e.getY();
		repaint();
	}

	
	public void mouseWheelMoved(MouseWheelEvent event) 
	{
	
		int notches = event.getWheelRotation();
	       if (notches < 0) 
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
}


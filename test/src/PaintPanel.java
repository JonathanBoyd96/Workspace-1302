// DotsPanel.java
// By: Alec Diaz
// CSCI 1302
// Project 1 - 110-point version

import java.util.ArrayList;

import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

public class PaintPanel extends JPanel
{
   public int SIZE = 6;  // radius of each dot

   private ArrayList<Point> pointList;
   private ArrayList<Color> colorList;
   private ArrayList<Integer> sizeList;
   private Color drawColor;
   
   public int SIZE2[];
   
   public int Counter = 0;
   
   //-----------------------------------------------------------------
   //  Constructor: Sets up this panel to listen for mouse events.
   //-----------------------------------------------------------------
   public PaintPanel()
   {
      pointList = new ArrayList<Point>();
      colorList = new ArrayList<Color>();
      sizeList = new ArrayList<Integer>();
      
      addMouseListener (new DotsListener());
      addMouseMotionListener(new DotsListener());
      addMouseWheelListener(new DotsListener());
      
      setBackground(Color.black);
      setPreferredSize(new Dimension(500, 500));
      
      drawColor = Color.red;
   }

   //-----------------------------------------------------------------
   //  Draws all of the dots stored in the list.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
	 
      super.paintComponent(page);
      
      int R = (int)(Math.random()*256);
      int G = (int)(Math.random()*256);
      int B = (int)(Math.random()*256);

      page.setColor(new Color(R,G,B));

      for (int a = 0; a < pointList.size(); a++)
      {
    	  page.setColor(colorList.get(a));
    	  page.fillRect(pointList.get(a).x-sizeList.get(a), pointList.get(a).y-sizeList.get(a), sizeList.get(a)*2, sizeList.get(a)*2);
      }
      
      page.setColor(Color.WHITE);
      page.drawString("Count: " + pointList.size(), 5,15);
      page.drawString("Size: " + SIZE, 5,30);
      
      drawSquares(page);
   }
   
   public void drawSquares(Graphics page)
   {
	   page.setColor(Color.RED);
	   page.fillRect(0, 375, 125, 125);
	   
	   page.setColor(Color.WHITE);
	   page.fillRect(125, 375, 125, 125);
	   
	   page.setColor(Color.BLUE);
	   page.fillRect(250, 375, 125, 125);
	   
	   page.setColor(new Color(153,0,153)); //This is Purple
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
    		drawColor = Color.RED;
     	}
    	else if(event.getX() >= 125 && event.getX() <= 250 && event.getY() >= 375 && event.getY() <= 500)
    	{
    		drawColor = Color.WHITE;
    	}
    	else if(event.getX() >= 250 && event.getX() <= 375 && event.getY() >= 375 && event.getY() <= 500)
    	{
    		drawColor = Color.BLUE;
    	}
    	else if(event.getX() >= 375 && event.getX() <= 500 && event.getY() >= 375 && event.getY() <= 500)
    	{
    		drawColor = new Color(153,0,153);
    	}
    	
    	pointList.add(event. getPoint());
    	colorList.add(drawColor);
    	sizeList.add(SIZE);
    	repaint();
      }
     
      public void mouseDragged(MouseEvent event) 
      {
    		pointList.add(event. getPoint());
        	colorList.add(drawColor);
        	sizeList.add(SIZE);
        	repaint();
      }
      
     
      
      
      public void mouseWheelMoved(MouseWheelEvent event)
      {
    	  if(event.getWheelRotation() < 0)
    		  SIZE += 1;
    	  else
    		  SIZE -= 1;
    	
    	  repaint();
      }
      
      //--------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //--------------------------------------------------------------
      public void mouseClicked(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
      public void mouseMoved(MouseEvent event) {}
   }
}

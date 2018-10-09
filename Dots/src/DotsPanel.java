// DotsPanel.java
// by Jonathan Boyd
// CSCI 1302
// Lab 3
// January 26th 2015

import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class DotsPanel extends JPanel
{
   private final int SIZE = 6;  // radius of each dot
   private int dragcount = 0;
   private ArrayList<Point> pointList;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this panel to listen for mouse events.
   //-----------------------------------------------------------------
   public DotsPanel()
   {
      pointList = new ArrayList<Point>();
      
      DotsListener listener = new DotsListener();

      addMouseListener (listener);
      addMouseMotionListener (listener);

      setBackground(Color.black);
      setPreferredSize(new Dimension(300, 200));
   }

   //-----------------------------------------------------------------
   //  Draws all of the dots stored in the list.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);


      page.setColor(new Color(dragcount%255, (dragcount*2)%255, (dragcount+128)%255));

      for (Point spot : pointList)
         page.fillOval(spot.x-SIZE, spot.y-SIZE, SIZE*2, SIZE*2);

      page.drawString("Count: " + pointList.size(), 5, 15);
      
   }

   //*****************************************************************
   //  Represents the listener for mouse events.
   //*****************************************************************
   private class DotsListener implements MouseListener, MouseMotionListener
   {
      //--------------------------------------------------------------
      //  Adds the current point to the list of points and redraws
      //  the panel whenever the mouse button is pressed.
      //--------------------------------------------------------------
      public void mousePressed(MouseEvent event)
      {
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
   
   MouseEvent event;
   
   public void mouseDragged(MouseEvent event) 
   {
	   dragcount++;
	pointList.add(event.getPoint());
	   //dragCount++;
	   repaint();
		
	}
   
	public void mouseMoved(MouseEvent e) 
	{
		int currentX = e.getX();
		int currentY = e.getY();
		repaint();
	}

   }	
}

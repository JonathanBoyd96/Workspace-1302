//********************************************************************
//  ReboundPanel.java       Author: Lewis/Loftus
//
//  Represents the primary panel for the Rebound program.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundPanel extends JPanel
{
   private final int WIDTH = 300, HEIGHT = 100;
   private final int DELAY1 = 20, DELAY2 = 10, IMAGE_SIZE = 35;

   private ImageIcon image1, image2;
   private Timer timer1, timer2;
   private int x1, y1, x2, y2, moveX1, moveY1, moveX2, moveY2;

   //-----------------------------------------------------------------
   //  Sets up the panel, including the timer for the animation.
   //-----------------------------------------------------------------
   public ReboundPanel()
   {
      timer1 = new Timer(DELAY1, new ReboundListener());
      timer2 = new Timer(DELAY2, new ReboundListener());
      
      image1 = new ImageIcon("happyFace.gif");
      image2 = new ImageIcon("happyFace.gif");
      
      x1 = 0;
      y1 = 40;
      
      x2 = 0;
      y2 = 40;
      moveX1 = moveY1 = 3;
      moveX2 = moveY2 = 5;

      setPreferredSize(new Dimension(WIDTH, HEIGHT));
      setBackground(Color.black);
      timer1.start();
      timer2.start();
   }

   //-----------------------------------------------------------------
   //  Draws the image in the current location.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);
      image1.paintIcon(this, page, x1, y1);
      image2.paintIcon(this, page, x2, y2);
   }

   //*****************************************************************
   //  Represents the action listener for the timer.
   //*****************************************************************
   private class ReboundListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Updates the position of the image and possibly the direction
      //  of movement whenever the timer fires an action event.
      //--------------------------------------------------------------
      public void actionPerformed(ActionEvent event)
      {
         x1 += moveX1;
         y1 += moveY1;
         
         x2 += moveX2;
         y2 += moveY2;

         if (x1 <= 0 || x1 >= WIDTH-IMAGE_SIZE)
            moveX1 = moveX1 * -1;

         if (y1 <= 0 || y1 >= HEIGHT-IMAGE_SIZE)
            moveY1 = moveY1 * -1;
         
         if (x2 <= 0 || x2 >= WIDTH-IMAGE_SIZE)
             moveX2 = moveX2 * -1;

          if (y2 <= 0 || y2 >= HEIGHT-IMAGE_SIZE)
             moveY2 = moveY2 * -1;
    
         repaint();
      }
   }
}

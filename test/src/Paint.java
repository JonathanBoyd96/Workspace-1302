// DotsPanel.java
// By: Alec Diaz
// CSCI 1302
// Project 1 - 110-point version

import javax.swing.JFrame;

public class Paint
{
   //-----------------------------------------------------------------
   //  Creates and displays the application frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Paint");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new PaintPanel());

      frame.pack();
      frame.setVisible(true);
   }
}

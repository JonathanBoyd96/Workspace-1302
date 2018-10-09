// Dots.java
// by Jonathan Boyd
// CSCI 1302
// Lab 3
// January 26th 2015


import javax.swing.JFrame;

public class Dots
{
   //-----------------------------------------------------------------
   //  Creates and displays the application frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Dots");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new DotsPanel());

      frame.pack();
      frame.setVisible(true);
   }
}

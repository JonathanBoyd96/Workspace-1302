import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;

import java.awt.Color;


public class SimonPanel extends JPanel
{
private final int WIDTH = 450;
private final int HEIGHT = 300;

private Timer timer;

// --------------------------------------------
// Sets up the panel, including the timer
// for the animation
// --------------------------------------------
    public SimonPanel ()
        {
    	setLayout(null);
    	
    	JButton GreenBtn = new JButton("");
    	GreenBtn.setBackground(Color.GREEN);
    	GreenBtn.setForeground(Color.GREEN);
    	GreenBtn.setBounds(0, 0, 231, 120);
    	GreenBtn.setOpaque(true);
    	GreenBtn.setBorderPainted(false);
    	add(GreenBtn);
    	
    	JButton YellowBtn = new JButton("");
    	YellowBtn.setBackground(Color.YELLOW);
    	YellowBtn.setForeground(Color.YELLOW);
    	YellowBtn.setBounds(0, 180, 231, 120);
    	add(YellowBtn);
    	
    	JButton BlueBtn = new JButton("");
    	BlueBtn.setBackground(Color.BLUE);
    	BlueBtn.setForeground(Color.BLUE);
    	BlueBtn.setBounds(231, 180, 219, 120);
    	add(BlueBtn);
    	
    	JButton RedBtn = new JButton("");
    	RedBtn.setBackground(Color.RED);
    	RedBtn.setForeground(Color.RED);
    	RedBtn.setBounds(231, 0, 219, 120);
    	add(RedBtn);
    	
    	JButton btnStart = new JButton("Start");
    	btnStart.setBounds(0, 123, 117, 29);
    	add(btnStart);
    	
    	JButton btnExit = new JButton("Exit");
    	btnExit.setBounds(0, 151, 117, 29);
    	add(btnExit);
    	
            timer = new Timer(30, new ReboundListener());
            setPreferredSize (new Dimension (WIDTH, HEIGHT));
            timer.start();
        }

    public void paintComponent (Graphics page)
        {
          
        }

public class ReboundListener implements ActionListener
{

    public void actionPerformed(ActionEvent action)
        {
        
        }
}

private int delay;

    
}
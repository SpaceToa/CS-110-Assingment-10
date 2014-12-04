import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WarBoard extends JFrame
{
   private JFrame frame;
   private JPanel panel;
   private JButton buttonNext;
   
   public WarBoard(String s)
   {  
      super(s);

      // set up a new panel in the frame
      int wHight = 500;
      int wWidth = 700;
      frame = new JFrame ();
      frame.setSize(wWidth,wHight);
      
      frame.setVisible(true);
      panel = new JPanel();
      panel.setSize(wWidth,wHight);
      buttonNext = new JButton("Next Round");
      frame.add(buttonNext);
      //buttonNext.addActionListener(new ButtonListener());
         
      add(panel);
   }

   public static void main(String [] args)
   {
      JFrame frame = new WarBoard("War");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
  
   }

}
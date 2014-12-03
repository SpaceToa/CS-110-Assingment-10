import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WarBoard extends JFrame
{
   private JPanel panel;
   private JButton buttonNext;
   
   public WarBoard(String s)
   {  
      super(s);

      // set up a new panel in the frame
      panel = new JPanel();
      buttonNext = new JButton("Next Round");
      panel.add(buttonNext);
      buttonNext.addActionListener(new ButtonListener());
         
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
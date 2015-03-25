import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

class ButtonFrame extends JFrame
{
  JButton bChange ; // reference to the button object

  // constructor for ButtonFrame
  ButtonFrame(String title) 
  {
    super( title );                     // invoke the JFrame constructor
    setLayout( new FlowLayout() );      // set the layout manager

    bChange = new JButton("Click Me!"); // construct a JButton
    add( bChange );                     // add the button to the JFrame
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
    
    ///
    bChange.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
//			System.out.println("rakib hasan riyad");
			try 
	        {
	            Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());
	        }           
	        catch (Exception e) {}
		}
	});
    
    ////////
    
  }
  
  
  
}

public class ButtonDemo
{
  public static void main ( String[] args )
  {
    ButtonFrame frm = new ButtonFrame("Button Demo");

    frm.setSize( 150, 75 );     
    frm.setVisible( true );   
  }
}
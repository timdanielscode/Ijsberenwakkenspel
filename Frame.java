package ijsberenspel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Frame extends javax.swing.JFrame
{
	public static void main( String args[] )
	{
		JFrame frame = new Frame();
		frame.setLocation( 375, 50 );
		frame.setSize( 1200, 850 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Ijsberenspel" );
		JPanel Panel = new Panel();
		frame.setContentPane(Panel);
		frame.setVisible ( true );
	}
}

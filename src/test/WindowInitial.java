package test;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class WindowInitial extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	JPanel panel =new JPanel();
	
	JPanel WindowChange0= new WindowChange0();
	JPanel WindowChange1= new WindowChange();
	JPanel WindowChange2= new WindowChange1();
	
	WindowInitial()
	{
		panel.add(WindowChange0);
		add(panel);
		setSize(400, 200);
		setLocationRelativeTo(null);
		panel.setVisible(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}






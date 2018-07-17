package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WindowChange1 extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	JLabel text = new JLabel("第三个页面");
	
	JButton Button1=new JButton("1");
	JButton Button2=new JButton("2");
	JButton Button3=new JButton("3");
	
	WindowChange1()
	{
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		add(text);
		add(Button1);
		add(Button2);
		add(Button3);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == Button1)//改变图形化界面为“初始”界面。
		{
			removeAll();
			add(new WindowChange0());
			validate();
			repaint();
		}
		else if(e.getSource() == Button2)//改变图形化界面为“后来”的界面。
		{
			removeAll();
			add(new WindowChange());//切换代码。
			validate();
			repaint();
		}
		else if(e.getSource() == Button3)//改变图形化界面为“初始”界面。
		{
			removeAll();
			add(new WindowChange1());
			validate();
			repaint();
		}
	}

}












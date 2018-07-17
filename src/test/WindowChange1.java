package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WindowChange1 extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	JLabel text = new JLabel("������ҳ��");
	
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
		if(e.getSource() == Button1)//�ı�ͼ�λ�����Ϊ����ʼ�����档
		{
			removeAll();
			add(new WindowChange0());
			validate();
			repaint();
		}
		else if(e.getSource() == Button2)//�ı�ͼ�λ�����Ϊ���������Ľ��档
		{
			removeAll();
			add(new WindowChange());//�л����롣
			validate();
			repaint();
		}
		else if(e.getSource() == Button3)//�ı�ͼ�λ�����Ϊ����ʼ�����档
		{
			removeAll();
			add(new WindowChange1());
			validate();
			repaint();
		}
	}

}












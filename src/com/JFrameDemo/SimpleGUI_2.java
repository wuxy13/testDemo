/**
 * 
 */
package com.JFrameDemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author wuxy13
 *������¼�
 */
public class SimpleGUI_2 {
	JFrame frame=new JFrame("��������frame");
	
	JButton button1=new JButton("�������»���");
	JButton button2=new JButton("���Ҹı�label");
	
	JLabel label=new JLabel();
	
	JPanel panel=new MyPanel();
	
	public void create(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		label.setText("����label");
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setText("�������ڶ�");
				((MyPanel)panel).reset();
				frame.repaint();
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("�����Ҹı���");
			}
		});
		
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH,button1);
		frame.getContentPane().add(BorderLayout.EAST,button2);
		frame.getContentPane().add(BorderLayout.WEST,label);
		
		frame.setSize(800,600);
		
		frame.setVisible(true);
		
		for(int i=0;i<100;i++){
			frame.repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

	
}

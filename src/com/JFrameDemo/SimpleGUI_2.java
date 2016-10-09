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
 *多监听事件
 */
public class SimpleGUI_2 {
	JFrame frame=new JFrame("吴向阳的frame");
	
	JButton button1=new JButton("点我重新绘制");
	JButton button2=new JButton("点我改变label");
	
	JLabel label=new JLabel();
	
	JPanel panel=new MyPanel();
	
	public void create(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		label.setText("我是label");
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setText("看！他在动");
				((MyPanel)panel).reset();
				frame.repaint();
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("哈哈我改变了");
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

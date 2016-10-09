/**
 * 
 */
package com.JFrameDemo;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

/**
 * @author wuxy13
 *JFrame GUI测试
 */
public class SimpleGUI_1 implements ActionListener {
	JFrame frame=new JFrame("吴向阳的frame");
	
	JButton button=new JButton("点我重新绘制");
	
	JLabel label=new JLabel();
//	int num=0;
	
	public void create(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new MyPanel();
		
		label.setText("我是label");
		
		
		button.addActionListener(this);
		
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		frame.getContentPane().add(BorderLayout.WEST,label);
		
		frame.setSize(800,600);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setText("重新绘制");
//		num++;
		frame.repaint();
//		button.addActionListener(this);
	}
}

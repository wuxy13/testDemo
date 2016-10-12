/**
 * 
 */
package com.testGUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.border.Border;

/**
 * @author wuxy13
 *
 */
public class testFrame {

	/**
	 * @param args
	 */
	public static void createdialog(){
		//Dialog d=new Dialog(null);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Frame ts=new Frame("Frame");
		ts.setLocation(200, 200);
		ts.setSize(800, 600);
		ts.setBackground(Color.blue);
		
		Label l=new Label("this is a label");
		
		Button b=new Button("打开对话框");
		b.setBackground(Color.red);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ts.dispose();
			}
		});
		
		
		Panel st=new Panel();
		st.setSize(800,100);
		st.setBackground(Color.pink);
		
		ts.add(st);
		ts.add(l);
		ts.add(b,BorderLayout.SOUTH);
		ts.setVisible(true);
	}

}

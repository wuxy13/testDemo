/**
 * 
 */
package com.SwingDemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author wuxy13
 *
 */
public class SimpleGUI_1 {
	JFrame frame=new JFrame("������");
	JPanel panel=new JPanel();
	JButton button=new JButton("ENTER");
	JTextField textField=new JTextField("�������������");
	JTextArea textArea=new JTextArea(10,40);
	JScrollPane scroll=new JScrollPane(textArea);
	JCheckBox checkBox=new JCheckBox("ѡ���߲�ѡ");
	
	String[] item={"EDG","RNG","IM","LGD","SH","WE"};
	JList<String> list=new JList<String>(item);
	JScrollPane scroll1=new JScrollPane(list);
	
	public void creat(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField.selectAll();
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.append("���С����\n");
			}
		});
		
		checkBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				if(checkBox.isSelected()){
					textField.setText("��ѡ����");
				}
				else{
					textField.setText("��ûѡ��");
				}
			}
		});
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		textArea.setLineWrap(true);
		textArea.setText("��ã�������textarea\n");
//		textArea.selectAll();
//		textArea.requestFocus();
		
		scroll1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setVisibleRowCount(2);
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if(!list.getValueIsAdjusting()){
					textArea.append(list.getSelectedValue()+"\n");
				}
				
			}
		});
		
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(scroll);
		panel.add(scroll1);
		panel.add(checkBox);
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.NORTH,textField);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		System.out.println(textField.getText());
	}
}

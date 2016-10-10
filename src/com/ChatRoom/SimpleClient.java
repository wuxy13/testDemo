package com.ChatRoom;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class SimpleClient implements Runnable {

	private JFrame frame;
	private JPanel panel;
	private JTextArea text1;
	private JScrollPane scroll1;
	private JTextArea text2;
	private JButton button;
	private Socket socket;
	private BufferedReader reader;
	private PrintWriter writer;
	
	public void go(){
		
		
		frame=new JFrame("吴小阳的聊天室客户端");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		
		text1=new JTextArea(20,60);
		text1.setLineWrap(true);
		scroll1=new JScrollPane(text1);
		scroll1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		text2=new JTextArea(2,60);
		text2.setText("请输入聊天内容");
//		text2.selectAll();
//		text2.requestFocus();
		panel.add(scroll1);
		panel.add(text2);
		
		button=new JButton("发送");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				writer.println(text2.getText());
				writer.flush();
			}
		});
		
		frame.add(BorderLayout.CENTER,panel);
		frame.add(BorderLayout.SOUTH, button);
		
		SetupNetworking();
		
		Thread getmessage=new Thread(new  Runnable() {
			public void run() {
//				SetupNetworking();
				String message;
				try {
					while((message=reader.readLine())!=null){
						System.out.println("getmessage"+message);
						text1.append("新消息:"+message+"\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		getmessage.start();
		
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
	
	public void SetupNetworking(){
		try {
			socket=new Socket("127.0.0.1", 6666);
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer=new PrintWriter(socket.getOutputStream());
			System.out.println("连接网络");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	public void stop(){
//		try {
//			reader.close();
//			writer.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}
	
}

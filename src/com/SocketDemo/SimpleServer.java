/**
 * 
 */
package com.SocketDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wuxy13
 *
 */
public class SimpleServer implements Runnable {

	/**
	 * @param args
	 */
	String[] list={"aaa","bbb","ccc","ddd","eee","fff","ggg","hhh","iii","jjj","kkk","lll","mmm","nnn"};
	
	public void go(){
		try {
			ServerSocket server=new ServerSocket(5000);
			while(true){
				Socket socket=server.accept();
				PrintWriter pw=new PrintWriter(socket.getOutputStream());
				String tt=back();
				pw.println(tt);
				pw.close();
				System.out.println(tt);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String back(){
		int a=(int)(Math.random()*13);
		return list[a];
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		SimpleServer sc=new SimpleServer();
		sc.go();
	}

}

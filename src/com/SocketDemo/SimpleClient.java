/**
 * 
 */
package com.SocketDemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author wuxy13
 *
 */
public class SimpleClient implements Runnable {
	
	/**
	 * @param args
	 */
	public void go(){
		try {
			Socket socket=new Socket("127.0.0.1", 5000);
			BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String temp=reader.readLine();
			System.out.println("***"+temp);
			reader.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void run() {
		SimpleClient client=new SimpleClient();
		for(int i=0;i<10;i++){
			client.go();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		client.go();
	}



}

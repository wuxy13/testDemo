/**
 * 
 */
package com.ChatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wuxy13
 *
 */
public class SimpleServer2 implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	ArrayList clients;
	
	public class ClientHandler implements Runnable{
		BufferedReader reader;
		Socket sock;
		
		public ClientHandler(Socket clientSocket) {
			// TODO Auto-generated constructor stub
			
			try {
				sock=clientSocket;
				reader=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			String message;
			try {
				while((message=reader.readLine())!=null){
					System.out.println("服务器"+message);
					tell(message);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void tell(String message) {
		Iterator iterator=clients.iterator();
		while(iterator.hasNext()){
			PrintWriter writer=(PrintWriter)iterator.next();
			writer.println(message);
			writer.flush();
		}
	}
	
	public void go() {
		clients=new ArrayList();
		try {
			ServerSocket serverSocket=new ServerSocket(6666);
			while(true){
				Socket clientSocket=serverSocket.accept();
				PrintWriter writer=new PrintWriter(clientSocket.getOutputStream());
				clients.add(writer);
				
				Thread thread=new Thread(new ClientHandler(clientSocket));
				thread.start();
				System.out.println("服务器捕获信息");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}

}

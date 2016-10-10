/**
 * 
 */
package com.ChatRoom;

/**
 * @author wuxy13
 *
 */
public class SimpleDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread client1=new Thread(new SimpleClient());
		Thread client2=new Thread(new SimpleClient());
//		Thread client3=new Thread(new SimpleClient());
//		Thread server=new Thread(new SimpleSever());
		Thread server=new Thread(new SimpleServer2());
		
		client1.start();
		client2.start();
//		client3.start();
		server.start();
	}

}

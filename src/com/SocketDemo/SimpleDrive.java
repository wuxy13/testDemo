/**
 * 
 */
package com.SocketDemo;

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
		Thread t1=new Thread(new SimpleClient());
		Thread t2=new Thread(new SimpleServer());
		
		t1.start();
		t2.start();
		
		
	}

}

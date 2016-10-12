/**
 * 
 */
package com.ThreadDemo;

/**
 * @author wuxy13
 *
 */
public class SynchronizeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable demo=new TestThread_1();
//		Thread thread1=new Thread(demo);
//		Thread thread2=new Thread(demo);
		
		Thread thread1=new Thread(new TestThread_1());
		Thread thread2=new Thread(new TestThread_1());
		
		thread1.start();
		thread2.start();
	}

}

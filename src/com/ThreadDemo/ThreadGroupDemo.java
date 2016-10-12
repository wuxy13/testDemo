/**
 * 
 */
package com.ThreadDemo;

/**
 * @author wuxy13
 *
 */
public class ThreadGroupDemo {

	/**
	 * @param args
	 */
	public void go(){
		ThreadGroup group1=new ThreadGroup("group1");
		ThreadGroup group2=new ThreadGroup(group1, "group2");
		ThreadGroup group3=new ThreadGroup(group2, "group3");
		Thread thread1=new Thread(group1, new TestThread("线程1"));
		Thread thread2=new Thread(group2, new TestThread("线程2"));
		Thread thread3=new Thread(group2, new TestThread("线程3"));
		Thread thread4=new Thread(group3, new TestThread("线程4"));
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		System.out.println(group1.activeCount());
		System.out.println(group2.activeCount());
		System.out.println(group3.activeCount());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroupDemo demo=new ThreadGroupDemo();
		demo.go();
	}

}

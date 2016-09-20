/**
 * 
 */
package com.testThread;

/**
 * @author wuxy13
 *
 */
public class testDemo {
	public static void main(String[] args) {
		Student s=new Student();
		
		setThread s1=new setThread(s);
		getThread s2=new getThread(s);
		
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		
		
		t1.start();
		t2.start();
	}
	
}

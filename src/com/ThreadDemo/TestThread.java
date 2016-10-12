/**
 * 
 */
package com.ThreadDemo;

/**
 * @author wuxy13
 *
 */
public class TestThread implements Runnable{
	private String name;
	public TestThread(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread:"+name);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

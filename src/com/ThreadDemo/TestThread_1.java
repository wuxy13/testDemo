/**
 * 
 */
package com.ThreadDemo;

/**
 * @author wuxy13
 *
 */
public class TestThread_1 implements Runnable{
	private int num=0;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			num=num+1;
			System.out.println(num);
		}
		System.out.println(num);
	}
	
}

/**
 * 
 */
package com.ThreadDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wuxy13
 *
 */
public class ExecutorDemo {

	/**
	 * @param args
	 */
	public void go(){
		ExecutorService exe=Executors.newFixedThreadPool(3);
		
		for(int i=0;i<50;i++){
			exe.execute(new TestThread("Ïß³Ì"+i));
		}
		
		exe.shutdown();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorDemo demo=new ExecutorDemo();
		demo.go();
	}

}

/**
 * 
 */
package com.FactoryDemo;

/**
 * @author wuxy13
 *
 */
public class Consumer implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	String name;
	Factory factory;
	
	public Consumer(String name,Factory factory) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.factory=factory;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			factory.consume(name);
			try {
				Thread.sleep((long)(Math.random()*2000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

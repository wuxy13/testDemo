/**
 * 
 */
package com.FactoryDemo;

/**
 * @author wuxy13
 *
 */
public class Producer implements Runnable{

	String name;
	Factory factory;
	
	public Producer(String name,Factory factory) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.factory=factory;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
				factory.produce(new Product(name));
				try {
					Thread.sleep((long)(Math.random()*3000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

}

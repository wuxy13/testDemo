/**
 * 
 */
package com.FactoryDemo;

/**
 * @author wuxy13
 *
 */
public class DriveDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		
		Thread producer1=new Thread(new Producer("������", factory));
		Thread producer2=new Thread(new Producer("��ȫ��", factory));
		Thread consumer1=new Thread(new Consumer("����", factory));
		
		producer1.start();
		producer2.start();
		consumer1.start();
	}

}

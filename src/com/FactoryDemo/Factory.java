/**
 * 
 */
package com.FactoryDemo;

/**
 * @author wuxy13
 *
 */
public class Factory {
	private Product[] factory=new Product[3];
	private int index=0;
	
	//boolean produceflag=true;
	
	public synchronized void produce(Product product){
		if(index==factory.length){
			try {
				//produceflag=false;				
				System.out.println(product.getProducedBy()+"producer is waiting");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//produceflag=true;
		if(index!=factory.length){
			factory[index]=product;
			++index;
			System.out.println(index+":"+product.getProducedBy()+"������---"+product.getProduct());
			notify();
			System.out.println(product.getProducedBy()+"����Ǳ�ڵ�������");
		}
		else{
			System.out.println("�߳�notidfy��ͻ"+product.getProducedBy()+"�޷�����");
		}
		
	}
	
	public synchronized void consume(String consumerName){
		if(index==0){
			try {
				System.out.println("consumer is waiting");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		--index;
		Product product=factory[index];
		product.setConsumedBy(consumerName);
		System.out.println(index+":"+product.getConsumedBy()+"������---"+product.getProduct());
		
		notify();
		System.out.println(product.getConsumedBy()+"����Ǳ�ڵ�������");
	}
}

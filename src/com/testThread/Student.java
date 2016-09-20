/**
 * 
 */
package com.testThread;

/**
 * @author wuxy13
 *
 */
public class Student {
	private String name;
	private int age;
	private char gender;
	private boolean flag;//判断是否存在一个学生
	
	public synchronized void setStudent(String name,int age,char gendar) {
		if(flag==true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name=name;
		this.age=age;
		this.gender=gendar;
		flag=false;
		notify();
	}
	
	public synchronized void getStudent() {
		if(flag==false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(this.name+"/"+this.age+"/"+this.gender);
		flag=true;
		notify();
	}
}

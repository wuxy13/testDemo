/**
 * 
 */
package com.GuessNumberGame;

/**
 * @author wuxy13
 *
 *��ң����в����ֵĹ���
 *
 */
public class Player {
	int number;
	String name;
	
	public Player() {
		// TODO Auto-generated constructor stub
		name="Ĭ�����";
	}
	public Player(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	protected void guess(){
		number=(int)(Math.random()*5);
		System.out.println("****���"+name+"�µ�������"+number+"****");
	}
	
	protected boolean isRight(int number){
		if(this.number==number){
			return true;
		}
		return false;
	}
}

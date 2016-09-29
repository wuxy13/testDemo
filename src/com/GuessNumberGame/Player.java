/**
 * 
 */
package com.GuessNumberGame;

/**
 * @author wuxy13
 *
 *玩家：具有猜数字的功能
 *
 */
public class Player {
	int number;
	String name;
	
	public Player() {
		// TODO Auto-generated constructor stub
		name="默认玩家";
	}
	public Player(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	protected void guess(){
		number=(int)(Math.random()*5);
		System.out.println("****玩家"+name+"猜的数字是"+number+"****");
	}
	
	protected boolean isRight(int number){
		if(this.number==number){
			return true;
		}
		return false;
	}
}

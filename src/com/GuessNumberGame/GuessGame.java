/**
 * 
 */
package com.GuessNumberGame;

/**
 * @author wuxy13
 *比赛过程
 */
public class GuessGame {
	Player player1;
	Player player2;
	int rightNumber;
	
	public void start(){
		player1=new Player("苏大鱼");
		player2=new Player("皖琼苏");
		boolean flag=true;
		int times=1;
		
		while(flag){
			System.out.println("~~~~第"+times+"次游戏~~~~");
			
			rightNumber=(int)(Math.random()*5);
			
			player1.guess();
			player2.guess();
			
			
			if(player1.isRight(rightNumber)&&player2.isRight(rightNumber)){
				System.out.println("$$$$恭喜"+player1.name+"和"+player2.name+"全部都猜中啦$$$$");
				System.out.println("正确的数字为："+rightNumber);
				System.out.println(player1.name+":"+player1.isRight(rightNumber));
				System.out.println(player2.name+":"+player2.isRight(rightNumber));
				flag=false;
			}
			else {
				System.out.println("####很遗憾"+player1.name+"和"+player2.name+"没有全部猜中####");
				System.out.println("正确的数字为："+rightNumber);
				System.out.println(player1.name+":"+player1.isRight(rightNumber));
				System.out.println(player2.name+":"+player2.isRight(rightNumber));
			}
			
			++times;
		}
		
	}
}

/**
 * 
 */
package com.GuessNumberGame;

/**
 * @author wuxy13
 *��������
 */
public class GuessGame {
	Player player1;
	Player player2;
	int rightNumber;
	
	public void start(){
		player1=new Player("�մ���");
		player2=new Player("������");
		boolean flag=true;
		int times=1;
		
		while(flag){
			System.out.println("~~~~��"+times+"����Ϸ~~~~");
			
			rightNumber=(int)(Math.random()*5);
			
			player1.guess();
			player2.guess();
			
			
			if(player1.isRight(rightNumber)&&player2.isRight(rightNumber)){
				System.out.println("$$$$��ϲ"+player1.name+"��"+player2.name+"ȫ����������$$$$");
				System.out.println("��ȷ������Ϊ��"+rightNumber);
				System.out.println(player1.name+":"+player1.isRight(rightNumber));
				System.out.println(player2.name+":"+player2.isRight(rightNumber));
				flag=false;
			}
			else {
				System.out.println("####���ź�"+player1.name+"��"+player2.name+"û��ȫ������####");
				System.out.println("��ȷ������Ϊ��"+rightNumber);
				System.out.println(player1.name+":"+player1.isRight(rightNumber));
				System.out.println(player2.name+":"+player2.isRight(rightNumber));
			}
			
			++times;
		}
		
	}
}

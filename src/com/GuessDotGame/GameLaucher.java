/**
 * 
 */
package com.GuessDotGame;

/**
 * @author wuxy13
 *
 */
public class GameLaucher {
	public static void main(String[] args) {
		int guessNum=1;
		
		SimpleDotCom dotCom=new SimpleDotCom();
		int location=(int)(Math.random()*7+1);
		int[] dot={location,location+1,location+2};
//		System.out.println(dot[0]);
		
		dotCom.setLocation(dot);
		
		while(!dotCom.isOver()){
			String input=new GameHelper().getUserInput("�����뱾�����λ��(0~9)");
			System.out.println("��"+guessNum+"�����,������Ϊ��"+dotCom.checkYourself(input));
			guessNum++;
			
		}
	}

}

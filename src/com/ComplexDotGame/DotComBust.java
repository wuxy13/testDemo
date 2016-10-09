/**
 * 
 */
package com.ComplexDotGame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author wuxy13
 *
 *helper
 *dotComList
 *
 */
public class DotComBust {
	private GameHelper helper;
	private ArrayList<DotCom> dotComList;
	//private int guessUp;
	
	public DotComBust() {
		// TODO Auto-generated constructor stub
		helper=new GameHelper();
		dotComList=new ArrayList<DotCom>();
		//guessUp=100;
	}
	
	/*��ʼ����Ϸ*/
	public void setUpGame(){
//		for(int i=1;i<n+1;i++){
//			System.out.println("������ս��"+i+"������");
//			Scanner in=new Scanner(System.in);
//			String name=in.nextLine();
//			if(helper.isExist()){
//				dotComList.add(new DotCom(name,helper.getLocation()));
//			}
//		}
		
		if(helper.isExist()){
			ArrayList<String> s1=new ArrayList<String>();
			s1=helper.getLocation();
			DotCom a1=new DotCom("�մ���",s1);
//			a1.printDot();
			dotComList.add(a1);
		}
		if(helper.isExist()){
			ArrayList<String> s2=new ArrayList<String>();
			s2=helper.getLocation();
			DotCom a2=new DotCom("������",s2);
//			a2.printDot();
			dotComList.add(a2);
		}
		
		for(DotCom tempShip:dotComList){
			tempShip.printDot();
		}
		
//		for(int i=0;i<dotComList.size();i++){
//			dotComList.get(i).printDot();
//		}

	}
	
	public void refresh(){
		for(int i=0;i<dotComList.size();i++){
			if(dotComList.get(i).getLocation().isEmpty()){
				System.out.println(dotComList.get(i).getName()+"���ѱ��ݻ�");
				dotComList.remove(i);
			}
		}
	}
	
	public boolean isGuessAll(){
		if(dotComList.isEmpty()){
			return true;
		}
		return false;
	}
	
	public void check(String guessLocation){
		for(DotCom a:dotComList){
			System.out.println(a.checkGuess(guessLocation)); 
		}
	}
	
	public void gameFinish(){
		System.out.println("ս���ֲ�����:");
		helper.printBoard();
		System.out.println("��Ϸ����");
	}
	
	public void startUp(){
		while(!isGuessAll()){
			
			System.out.println("��������Ҫ�����λ��(A~E+1~5)");
			Scanner in=new Scanner(System.in);
			String guessLocation=in.nextLine();
			check(guessLocation);
			
			refresh();
		}
		System.out.println("����");
		gameFinish();
		
	}
	
	

}

/**
 * 
 */
package com.GuessDotGame;

/**
 * @author wuxy13
 *
 */
public class SimpleDotCom {
	int rightNum=0;
	int[] location;
	
	public void setLocation(int[] location){
		this.location=location;
	}
	
	public String checkYourself(String stringNum){
		int num=Integer.parseInt(stringNum);
//		System.out.println("num"+num);
//		System.out.println("location[0]"+location[0]);
		String result="���ź���û������Ŀ��";
		
		for(int i:location){
			if(i==num){
				rightNum++;
				result="�ɹ�����һ��";
			}
		}
		
		if(rightNum==3){
			result="ȫ�����У��н��Ѵݻ�";
		}
		
		return result;
	}
	
	public boolean isOver(){
		if(rightNum==3){
			return true;
		}
		return false;
	}
}

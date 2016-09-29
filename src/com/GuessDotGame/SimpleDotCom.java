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
		String result="很遗憾并没有命中目标";
		
		for(int i:location){
			if(i==num){
				rightNum++;
				result="成功命中一次";
			}
		}
		
		if(rightNum==3){
			result="全部命中，敌舰已摧毁";
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

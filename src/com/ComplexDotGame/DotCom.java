/**
 * 
 */
package com.ComplexDotGame;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author wuxy13
 * 
 * location
 * name
 * 构造函数
 * check
 *
 */
public class DotCom {
	private String name;
	private ArrayList<String> location;
	
	public String getName() {
		return name;
	}

	public ArrayList<String> getLocation() {
		return location;
	}

	public DotCom() {
		// TODO Auto-generated constructor stub
		name="机器人";
		location=new ArrayList<String>();
	}
	
	public DotCom(String name,ArrayList<String> location){
		this.name=name;
		this.location=location;
	}
	
	public void printDot(){
		System.out.println(name);
		for(String a:location){
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public String checkGuess(String guessLocation){
		String result ="没有命中"+name;
		
		int index=location.indexOf(guessLocation);
		
		if(index>=0){
			location.remove(index);
			
			if(location.isEmpty()){
				result="全部命中"+name;
			}
			else{
				result="命中"+name;
			}	
		}
		
		return result;
	}
	
	
}

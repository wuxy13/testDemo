/**
 * 
 */
package com.GuessDotGame;

import java.util.Scanner;

/**
 * @author wuxy13
 *
 */
public class GameHelper {
	public String getUserInput(String temp){
		System.out.println(temp);
		Scanner input=new Scanner(System.in);
		return input.nextLine();
	}
}

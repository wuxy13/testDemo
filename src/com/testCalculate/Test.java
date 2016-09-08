/**
 * 
 */
package com.testCalculate;

import java.util.Scanner;

/**
 * @author wuxy13
 *测试
 *
 */
public class Test {
	public static void main(String[] args) {
		while(true){
			System.out.println("请输入需要计算的数学表达式:");
			//String expression=System.console().readLine();
			Scanner reader=new Scanner(System.in);
			String expression=reader.nextLine();
			ICalculate calculator;
			if(expression.indexOf('+')!=-1){
				calculator=new Plus();
			}
			else if (expression.indexOf('-')!=-1){
				calculator=new Minus();
			}else if(expression.indexOf('*')!=-1){
				calculator=new Multiple();
			}else if(expression.indexOf('/')!=-1){
				calculator=new Divide();
			}else{
				calculator=new Default();
			}
			int value=calculator.calculate(expression);
			System.out.println(expression+"="+value);
		}
	}
}

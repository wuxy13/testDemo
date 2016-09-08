/**
 * 
 */
package com.testCalculate;

/**
 * @author wuxy13
 *除法实现
 */
public class Divide extends ACalculate implements ICalculate {

	/* (non-Javadoc)
	 * @see com.testCalculate.ICalculate#calculate(java.lang.String)
	 */
	@Override
	public int calculate(String expression) {
		// TODO Auto-generated method stub
		int arrayInt[]=split(expression, "/");
		if(arrayInt[1]==0){
			System.out.println("除数不能为零");
			return -1;
		}
		return arrayInt[0]/arrayInt[1];
	}

}

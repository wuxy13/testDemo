/**
 * 
 */
package com.testCalculate;

/**
 * @author wuxy13
 * 加法实现
 *
 */
public class Plus extends ACalculate implements ICalculate {

	/* (non-Javadoc)
	 * @see com.testCalculate.ICalculate#calculate(java.lang.String)
	 */
	@Override
	public int calculate(String expression) {
		// TODO Auto-generated method stub
		int arrayInt[]=split(expression, "\\+");
		return arrayInt[0]+arrayInt[1];
	}

}

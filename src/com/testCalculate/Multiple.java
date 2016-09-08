/**
 * 
 */
package com.testCalculate;

/**
 * @author wuxy13
 * ≥À∑® µœ÷
 *
 */
public class Multiple extends ACalculate implements ICalculate {

	/* (non-Javadoc)
	 * @see com.testCalculate.ICalculate#calculate(java.lang.String)
	 */
	@Override
	public int calculate(String expression) {
		// TODO Auto-generated method stub
		int arrayInt[]=split(expression, "\\*");
		return arrayInt[0]*arrayInt[1];
	}

}

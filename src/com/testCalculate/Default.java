/**
 * 
 */
package com.testCalculate;

/**
 * @author wuxy13
 *其他运算：提醒用户
 *
 */
public class Default extends ACalculate implements ICalculate {

	/* (non-Javadoc)
	 * @see com.testCalculate.ICalculate#calculate(java.lang.String)
	 */
	@Override
	public int calculate(String expression) {
		// TODO Auto-generated method stub
		System.out.println("该运算不支持哦，亲~");
		return -1;
	}

}

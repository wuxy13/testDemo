/**
 * 
 */
package com.testCalculate;

/**
 * @author wuxy13
 *������������
 *��ȡ���ʽ�е���ֵ
 */
public abstract class ACalculate {
	public int[] split(String expression,String deliString) {
		String array[]=expression.split(deliString);
		int arrayInt[]=new int[2];
		arrayInt[0]=Integer.parseInt(array[0]);
		arrayInt[1]=Integer.parseInt(array[1]);
		return arrayInt;
	}

}

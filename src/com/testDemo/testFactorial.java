package com.testDemo;

public class testFactorial {
	
	int fact(int n){
		int result;
		if(n==1){
			System.out.println("n="+n);
			return 1;
		}
		result = fact(n-1)*n;
		System.out.println("n="+n+"Ê±·µ»Ø"+result);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testFactorial test= new testFactorial();
		test.fact(10);
		
	}

}

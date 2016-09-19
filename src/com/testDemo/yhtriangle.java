/*
 * 杨辉三角
 * 
 * */
package com.testDemo;

import java.util.Scanner;

public class yhtriangle {
	public void yh() {
		Scanner a=new Scanner(System.in);
		System.out.println("请输入要生成杨辉三角的行数");
		int layer_x=a.nextInt();
		int [][] yhsj=new int [layer_x][];
		for(int i=0;i<layer_x;i++){
			yhsj[i]=new int[i+1];
			if(i==0){
				yhsj[0][0]=1;
				continue;
			}
			if(i==1){
				yhsj[1][0]=1;
				yhsj[1][1]=1;
				continue;
			}
			for(int j=0;j<i+1;j++){
				if(j!=0&&j!=i){
					yhsj[i][j]=yhsj[i-1][j-1]+yhsj[i-1][j];
				}
				else{
					yhsj[i][j]=1;
				}
			}
		}
		
		for(int i=0;i<layer_x;i++){
			for(int j=0;j<i+1;j++){
				System.out.print(yhsj[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		yhtriangle test=new yhtriangle();
		test.yh();
	}

}

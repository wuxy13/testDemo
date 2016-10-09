/**
 * 
 */
package com.ComplexDotGame;

import java.util.ArrayList;

/**
 * @author wuxy13
 * 总棋盘为5*5
 * 生成2个3*1，且不能重叠
 */
public class GameHelper {
	public String [][]board=new String[5][5];
	public ArrayList<String> location;
	
	public GameHelper() {
		// TODO Auto-generated constructor stub
		location=new ArrayList<String>();
		
		String[] front=new String[]{"A","B","C","D","E"};
		String[] back=new String[]{"1","2","3","4","5"};
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				board[i][j]=front[i]+back[j];
			}
		}
		
		
	}
	
	/*打印棋盘状态*/
	public void printBoard(){
		System.out.println("当前棋盘状态为:");
		for(String[] a:board){
			for(String b:a){
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
	
	
	public ArrayList<String> getLocation(){
		ArrayList<String> arr=new ArrayList<String>();
		for(String a:location){
			arr.add(a);
		}
		return arr;
	}
	
	
	public boolean isExist(){
		//ArrayList<String> location=new ArrayList<String>();
		
		int flag=100;
		char[] directions=new char[]{'w','s','a','d'};
		
		while(--flag>0){
			int locationX=(int)(Math.random()*5);
			int locationY=(int)(Math.random()*5);
			for(int i=0;i<4;i++){
				if(check(locationX, locationY, directions[i])){
					return true;
				}
			}
		}
		
		
		return false;
	}
	
	/*检验随机选取位置的合法性*/
	public boolean check(int locationX,int locationY,char direction){
		boolean result=false;
		boolean flag=false;
		location.clear();
		
		switch (direction) {
		case 'w':
			if(locationY>=2){
				flag=true;
				for(int i=0;i<3;i++){
					if(board[locationX][locationY-i].matches("NU")){
						flag=false;
						break;
					}
				}
				
				if(flag){
					for(int j=0;j<3;j++){
						location.add(board[locationX][locationY-j]);
						board[locationX][locationY-j]="NU";
					}
				}
			}
			break;
		case 's':
			if(locationY<=2){
				flag=true;
				for(int i=0;i<3;i++){
					if(board[locationX][locationY+i].matches("NU")){
						flag=false;
						break;
					}
				}
				
				if(flag){
					for(int j=0;j<3;j++){
						location.add(board[locationX][locationY+j]);
						board[locationX][locationY+j]="NU";
					}
				}
			}
			break;
		case 'a':
			if(locationX>=2){
				flag=true;
				for(int i=0;i<3;i++){
					if(board[locationX-i][locationY].matches("NU")){
						flag=false;
						break;
					}
				}
				
				if(flag){
					for(int j=0;j<3;j++){
						location.add(board[locationX-j][locationY]);
						board[locationX-j][locationY]="NU";
					}
				}
			}
			break;
		case 'd':
			if(locationX<=2){
				flag=true;
				for(int i=0;i<3;i++){
					if(board[locationX+i][locationY].matches("NU")){
						flag=false;
						break;
					}
				}
				
				if(flag){
					for(int j=0;j<3;j++){
						location.add(board[locationX+j][locationY]);
						board[locationX+j][locationY]="NU";
					}
				}
			}
			break;

		default:
			break;
		}
		
		if(flag){
			result=true;
		}
		
		return result;
	}
	
	/*
	public static void main(String[] args) {
		GameHelper helper=new GameHelper();
		helper.printBoard();
		
		for(int i=0;i<5;i++){
			ArrayList<String> temp=new ArrayList<String>();
			if(helper.isExist()){
				temp=helper.getLocation();
				//helper.printBoard();
				for(String a:temp){
					System.out.print(a+" ");
				}
				System.out.println();
			}
			else{
				System.out.println("已经无法创建1*3的战舰");
			}
			
		}
		
	}*/
}

/**
 * 
 */
package com.JFrameDemo;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author wuxy13
 *
 */
public class MyPanel extends JPanel{
	
	/*绘制矩形*/
//	public void paintComponent(Graphics g){
//		g.setColor(Color.GREEN);
//		g.fillRect(5,50, 200, 300);
//	}
	
	/*显示图片*/
//	public void paintComponent(Graphics g){
//		Image img=new ImageIcon("G:\\workspace\\testDemo\\src\\com\\JFrameDemo\\haimian.jpg").getImage();
//		g.drawImage(img, 100, 100, this);
//	}
	
	/*绘制随机色彩的圆圈*/
//	public void paintComponent(Graphics g){
//		g.fillRect(0,0,this.getWidth(), this.getHeight());
//		
//		int red=(int)(Math.random()*255);
//		int green=(int)(Math.random()*255);
//		int blue=(int)(Math.random()*255);
//		
//		Color randomColor=new Color(red, green, blue);
//		g.setColor(randomColor);
//		g.fillOval(100, 100, 200, 200);
//		g.fillOval(175, 300, 250, 250);
//		g.fillOval(300, 100, 200, 200);
//		
//	}
	
	int x=50;
	int y=50;
	
	public void reset(){
		x=50;
		y=50;
	}

	/*绘制2D渐层颜色*/
	public void paintComponent(Graphics g){
		//g.fillRect(0,0,this.getWidth(), this.getHeight());
		
		Graphics2D graphics2d=(Graphics2D)g;
		
		int red=(int)(Math.random()*255);
		int green=(int)(Math.random()*255);
		int blue=(int)(Math.random()*255);
		Color startColor=new Color(red, green, blue);
		
		red=(int)(Math.random()*255);
		green=(int)(Math.random()*255);
		blue=(int)(Math.random()*255);
		Color endColor=new Color(red, green, blue);
		
		
		graphics2d.setPaint(new GradientPaint(100, 100, startColor, 200, 200, endColor));
		graphics2d.fillOval(x, y, 100, 100);
		x++;
		y++;
		
		
		
	}
	
}

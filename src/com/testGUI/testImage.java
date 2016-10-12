/**
 * 
 */
package com.testGUI;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * @author wuxy13
 *
 */
public class testImage extends Frame {

	/**
	 * @param args
	 */
	String filename;
	public void showImage(String filename){
		setSize(400, 300);
		setVisible(true);
		this.filename=filename;
	}
	
	public void paint(Graphics g){
		Image im=getToolkit().getImage(filename);
		g.drawImage(im, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new testImage().showImage("G:\\workspace\\testDemo\\src\\com\\testGUI\\image.png");
	}

}

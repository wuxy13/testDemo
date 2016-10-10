/**
 * 
 */
package com.CardGame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 * @author wuxy13
 *
 */
public class CardBuilder {
	private JFrame frame;
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<Card> Cardlist=new ArrayList<Card>();
	
	public void create(){
		frame=new JFrame("Card Builder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton button1=new JButton("save");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("G:\\workspace\\testDemo\\src\\com\\CardGame\\save.txt"));
					for(Card a:Cardlist){
						os.writeObject(a);
					}
					os.close();
					System.out.println("card build success");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		JButton button2=new JButton("next");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Card card=new Card(question.getText(), answer.getText());
				Cardlist.add(card);
				question.setText("");
				answer.setText("");
			}
		});
		
		Font bigfont=new Font("sanserif",Font.BOLD, 24);
		
		question=new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigfont);
		
		answer=new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigfont);
		
		JScrollPane q=new JScrollPane(question);
		q.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		q.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JScrollPane a=new JScrollPane(answer);
		a.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		a.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JLabel qLabel=new JLabel("Question");
		JLabel aLabel=new JLabel("answer");
		
		panel.add(qLabel);
		panel.add(q);
		panel.add(aLabel);
		panel.add(a);
		
		frame.add(BorderLayout.CENTER,panel);
		frame.add(BorderLayout.WEST, button1);
		frame.add(BorderLayout.EAST, button2);
		
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		CardBuilder cb=new CardBuilder();
		cb.create();
	}
}

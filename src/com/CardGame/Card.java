/**
 * 
 */
package com.CardGame;

import java.io.Serializable;

/**
 * @author wuxy13
 *card¿‡
 */
public class Card implements Serializable {
	private String question;
	private String answer;
	public Card(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	
	public void print() {
		System.out.println(question+":"+answer);
		
	}
	
}

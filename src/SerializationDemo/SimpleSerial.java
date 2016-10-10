/**
 * 
 */
package SerializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author wuxy13
 *
 */
public class SimpleSerial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCharacter player1=new GameCharacter("������", "սʿ", new String[]{"��Ѫ��","�����"}, 99);
		GameCharacter player2=new GameCharacter("������", "��ʦ", new String[]{"����ʹ","Ů��"}, 88);
		GameCharacter player3=new GameCharacter("��ȫ��", "̹��", new String[]{"����","��ͽ"}, 77);
		
		try {
			ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("G:\\workspace\\testDemo\\src\\save.txt"));
			os.writeObject(player1);
			os.writeObject(player2);
			os.writeObject(player3);
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			ObjectInputStream is=new ObjectInputStream(new FileInputStream("G:\\workspace\\testDemo\\src\\save.txt"));
			GameCharacter newplayer1=(GameCharacter)is.readObject();
			GameCharacter newplayer2=(GameCharacter)is.readObject();
			GameCharacter newplayer3=(GameCharacter)is.readObject();
			is.close();
			newplayer1.print();
			newplayer2.print();
			newplayer3.print();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���");
	}

}

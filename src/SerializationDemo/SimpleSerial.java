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
		GameCharacter player1=new GameCharacter("王尼玛", "战士", new String[]{"饮血剑","复活甲"}, 99);
		GameCharacter player2=new GameCharacter("赵铁柱", "牧师", new String[]{"大天使","女妖"}, 88);
		GameCharacter player3=new GameCharacter("张全蛋", "坦克", new String[]{"黑切","狂徒"}, 77);
		
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
		
		System.out.println("完成");
	}

}

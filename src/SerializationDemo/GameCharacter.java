/**
 * 
 */
package SerializationDemo;

import java.io.Serializable;

/**
 * @author wuxy13
 *��Ϸ��ɫ��
 *ְҵ
 *����
 *����
 *�ȼ�
 */
public class GameCharacter implements Serializable{
	private String name;
	private String job;
	private String[] weapon;
	private int level;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getWeapon() {
		return weapon;
	}
	public void setWeapon(String[] weapon) {
		this.weapon = weapon;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public GameCharacter() {
		// TODO Auto-generated constructor stub
		name="Ĭ������";
		job="Ĭ��ְҵ";
		level=0;
	}
	public GameCharacter(String name, String job, String[] weapon, int level) {

		this.name = name;
		this.job = job;
		this.weapon = weapon;
		this.level = level;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(job);
		for(String a:weapon){
			System.out.print(a+"&");
		}
		System.out.println();
		System.out.println(level);
	}
	
	
}

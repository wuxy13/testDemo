/**
 * 
 */
package com.testThread;

/**
 * @author wuxy13
 *
 */
public class setThread implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	private Student student;
	private boolean flag=false;
	
	public setThread(Student student) {
		// TODO Auto-generated constructor stub
		this.student=student;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(flag==false){
				this.student.setStudent("������", 25,'��');
				flag=true;
			}
			else {
				this.student.setStudent("����ϼ", 26, 'Ů');
				flag=false;
			}
		}

	}

}

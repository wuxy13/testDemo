/**
 * 
 */
package com.testThread;

/**
 * @author wuxy13
 *
 */
public class getThread implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	private Student student;
	
	public getThread(Student student) {
		// TODO Auto-generated constructor stub
		this.student=student;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.print(Thread.currentThread().getName());
			this.student.getStudent();
		}
		
	}

}
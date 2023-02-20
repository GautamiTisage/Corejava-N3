package org.tnsif.multithreading;

public class ThreadExecuter {

	public static void main(String[] args) {
		simplethreadprogram p=new simplethreadprogram();
		//used to changed the thread name
		p.setName("java thread");
		//used to changed the priority
		p.setPriority(8);
		//when thread call to start method
		p.start();
		//p.start();
		p.run();
		System.out.println("Current thread "+p);
		

	}

}

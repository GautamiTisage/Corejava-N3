package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueuedemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
		obj.add(13);
		obj.add(15);
		obj.add(91);
		obj.add(55);
		System.out.println("queue elements are: " +obj);
		
		/*obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();*/
		
		/*obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();*/
		obj.remove();
		System.out.println("queue elements are: " +obj);
		
		System.out.println("head elements are "+obj.peek());
		System.out.println("head elements is "+obj.element());


	}

}

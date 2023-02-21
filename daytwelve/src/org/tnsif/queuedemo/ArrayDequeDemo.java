package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<String>obj=new ArrayDeque<>();
		obj.add("gautami");
		obj.offerFirst("riddhi");
		obj.addLast("siddhi");
		System.out.println("Array Deque Elements Are: " +obj);
		
		//extract the elements from deque
		for(String itr:obj)
		{
			System.out.print(itr+"");
		}
		System.out.println();
		System.out.println();
		
		obj.remove();
		System.out.println("Array Deque Elements Are: " +obj);
		
		obj.removeFirst();
		System.out.println("Array Deque Elements Are: " +obj);
		
		obj.removeLast();
		System.out.println("Array Deque Elements Are: " +obj);
	}
	

}

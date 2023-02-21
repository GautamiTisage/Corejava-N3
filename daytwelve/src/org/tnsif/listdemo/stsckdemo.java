package org.tnsif.listdemo;

import java.util.Stack;

public class stsckdemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("gautami");
		obj.push("riddhi");
		obj.push("siddhi");
		obj.push("prajakta");
		System.out.println("the elements inside the stack" + "are: "+obj);
		obj.pop();
		System.out.println("the elements inside the stack" + "are: "+obj  );

	}

}

package org.tnsif.listdemo;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class vectordemo {

	public static void main(String[] args) {
		List<Object> obj1=new Vector<>();
		obj1.add(101);
		obj1.add(30.8f);
		obj1.add('z');
		obj1.addAll(obj1);
		obj1.add(30.8);
		System.out.println("first list is: "+obj1);
		System.out.println("size of list1 "+obj1.size());
		System.out.println("list 2 is empty? "+obj1.isEmpty() );
		obj1.remove(0);
		System.out.println("first list is: "+obj1);
		System.out.println(obj1.contains(101));
		System.out.println("element at location at: "+obj1.get(1));
		System.out.println("index of z: "+obj1.indexOf('z') );
		System.out.println("last index of 30.8f is : "+obj1.indexOf(30.8) );

		
		
	}

	}



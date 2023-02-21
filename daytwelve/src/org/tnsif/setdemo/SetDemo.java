package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		//set1
		//hashset will print the elements in unordered
		Set<Object>obj1=new HashSet<>();
		obj1.add(11);
		obj1.add("Naina");
		//set doesnt allowed
		obj1.add("Naina");
		obj1.add(88.99);
		System.out.println("Set1 elements are: "+obj1);
		
		//set2
		//linkedhashset will print element in ordered
		Set<Object>obj2=new LinkedHashSet<>();
		obj2.add(11);
		obj2.add("Naina");
		obj2.add(88.99);
		System.out.println("Set1 elements are: "+obj2);
		
		//obj2.addAll(obj1);
		System.out.println(obj1.equals(obj2));

	}

}

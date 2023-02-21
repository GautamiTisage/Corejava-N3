package org.tnsig.genericdemo;

import java.util.ArrayList;
import java.util.List;
//program to demonstrate on advantages of generics
public class GenericsAdvantagesExample {

	public static void main(String[] args) {
		
		//1.type safety
		List obj=new ArrayList<>();
		obj.add(15);
		obj.add("15");
		System.out.println("without generics "+obj);
		
		//with generics
		List <Integer>obj1=new ArrayList<>();
		obj1.add(15);
		//obj.add("15");
		System.out.println("with generics "+obj1);
		
		//2. type casting is not allowed in generics
		List obj2=new ArrayList<>();
		obj2.add("MET");
		//typecasting
		String str=(String)obj2.get(0);
		System.out.println(str);
		
		//with generics , typecasting is not allowed 
		List<String> obj3=new ArrayList<>();
		obj3.add("MET");
		//typecasting
		System.out.println(obj3);
	}

}

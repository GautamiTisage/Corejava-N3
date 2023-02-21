package org.tnsif.mapdemo;

import java.util.HashMap;
import java.util.Map;
//program to demonstrate on hashmap and linked hashmap
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj1=new HashMap<>();
		obj1.put(422003,"panchavati");
		obj1.put(422002,"baliandir");
		obj1.put(422001,"nsk road");
		System.out.println(obj1);
		
		//unordered
		Map<Integer,String>obj2=new HashMap<>();
		obj2.put(422003,"panchavati");
		obj2.put(422002,"baliandir");
		obj2.put(422001,"nsk road");
		System.out.println(obj2);
		

	}

}

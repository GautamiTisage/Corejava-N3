package org.tnsif.instanceofdemo;

import java.util.Scanner;

public class instanceofdemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter name ,address and age");
		String name=s.nextLine();
		String address=s.nextLine();
		int age=s.nextInt();
		
		// object creation
		child c=new  child();
		child c1=new  child(name,address,age);
		c1.setName(name);
		c1.setAddress(address);
		c1.setAge(age);
		System.out.println(c1);
		System.out.println(c instanceof persoon);
		System.out.println(c1 instanceof child);
	}

}

package org.tnsif.intro;
import java.util.Scanner;
public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		float y=sc.nextFloat();
		char z=sc.next().charAt(0);
		//String name=sc.next();
		//String str=sc.nextLine();
		double d=sc.nextDouble();
		System.out.println("value of x is"+x);
		System.out.println("value of x is"+y);
		System.out.println("value of x is"+z);
		//System.out.println("value of x is"+name);
		//System.out.println("value of x is"+str);
		System.out.println("value of x is"+d);
		
	}

}

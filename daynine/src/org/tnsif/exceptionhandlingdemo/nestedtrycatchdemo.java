package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class nestedtrycatchdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int arr[]=new int[] {11,22,33};
		
		
	
			try
			{
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception handled "+e);
			
			try
			{
				int res=x/y;
				System.out.println(arr[3]);
			}
		
		catch (ArithmeticException w)
		{
				System.out.println("exception handled "+w);
		}
		finally {
			System.out.println("Finally blocked");
		}
	}	
		}
	

}

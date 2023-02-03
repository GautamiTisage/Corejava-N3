package org.tnsif.operators;
import java.util.Scanner;
public class nestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>12)
		{
			if(weight>=40)
			{
				if(weight>140)
				{
					System.out.println("eligible");
				}
				else{
					System.out.println("not eligible");
				}
			}
			else {
				System.out.println("not eligible");
			}
		}
		else {
			System.out.println("not eligible");
		}
			}
		
	}


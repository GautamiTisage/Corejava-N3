package org.tnsif.Assignment;
import java.util.Scanner;
public class factorialfun {
	static int fact(int n)
	{
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
		factorial=factorial*i;}
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Factorial of a Number:"+fact(a));
		sc.close();

	}

}

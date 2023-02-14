package org.tnsif.exceptionhandlingdemo;
import java.util.Scanner;
public class ArithmaticExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Entere the value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		try {
			int res=x/y;
			System.out.println(res);
		}
		//catch blk handled the exception thrown by the blk
		catch (Exception e) {
			System.out.println("exception handled by using catch "+e );
		}
		finally {
			System.out.println("finally blocked");
		}
	}

}

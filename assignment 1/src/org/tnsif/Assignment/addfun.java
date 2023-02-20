package org.tnsif.Assignment;
import java.util.Scanner;
public class addfun {
	static int add(int x,int y) {
		int sum=x+y;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	    
	    System.out.println("Addition is:"+add(a,b));
	    sc.close();

	}

}

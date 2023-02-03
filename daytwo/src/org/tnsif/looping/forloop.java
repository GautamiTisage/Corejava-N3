package org.tnsif.looping;
import java.util.Scanner;
public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i+"  ");
		}
		System.out.println("");
		//to print n to 1
		for(int i=1;i>=n;i--) {
			System.out.println(i+"  ");
		}
	}

}

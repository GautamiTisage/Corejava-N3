package org.tnsif.looping;
import java.util.Scanner;
public class whiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(i+" ");
			i++;
		}
		System.out.println("");
		int j=1;
		while(n>=j)
		{
			System.out.println(n+" ");
			n--;
		}
	}

}

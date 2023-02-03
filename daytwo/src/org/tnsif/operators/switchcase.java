package org.tnsif.operators;
import java.util.Scanner;
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int song=sc.nextInt();
		switch (song) {
		case 1:
			System.out.println("kesariya");
			break;
		case 2:
			System.out.println("ved");
			break;
		case 3:
			System.out.println("calm down");
			break;
		default:
			System.out.println("not valid");
		}
		
	}

}

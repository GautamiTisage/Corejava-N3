package org.tnsif.Assignment;
import java.util.Scanner;
public class sumfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int sum=0,num=0;
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        while(n>0)
  {

  	num=n%10;
  	sum=sum+num;
  	n=n/10;
  }
  
  System.out.println(sum);
  sc.close();


  }
	}



package org.tnsif.arraydemo;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter no. of elements"  +"in the array");
		int n=s.nextInt();
		
		//array declaration
		int arr[]=new int [n];
		//to allocate an new value to an array
		for (int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Aray elements are:");
		//to print the elements of an array
		for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//to sort an array 
		System.out.println();
		Arrays.sort(arr);
		/*for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}*/
		System.out.println("sorted elements are");
		for (int itr:arr) 
		{
			System.out.println(itr+" ");
		}
		}

}

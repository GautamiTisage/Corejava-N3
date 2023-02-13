package org.tnsif.arraydemo;

public class ArrayProgram {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		int arr1[]=new int [5];
		arr1[0]=34;
		arr1[1]=99;
		arr1[2]=43;
		arr1[3]=55;
		arr1[4]=77;
		System.out.println(arr1[3]);
		System.out.println(arr[1]);
		System.out.println(arr.getClass().getName());
}
}
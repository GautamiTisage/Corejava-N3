package org.tnsig.genericdemo;

class GenericMethod
{
	public static <E> void print(E[] elements)
	{
		for (E itr:elements)
		{
			System.out.println(itr+ " ");
		}
		System.out.println();
	}
}

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod m=new GenericMethod();
		Integer[] array1= {10,22,11,44};
		Character[] array2= {'g','a','p'};
		System.out.println("integer character");
		m.print(array1);
		System.out.println("character array");
		m.print(array2);


	}
	

}

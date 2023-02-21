package org.tnsig.genericdemo;
//program to demonstrate generic class
//GenericClass defination
class GenericClass<T>
{
	T x;
	void display(T x)
	{
		this.x=x;
	}
	//to return the elements
	T accept()
	{
		return x;
	}
}

//driver class
public class GenericClassDemo {

	public static void main(String[] args) {
		GenericClass<String>obj1=new GenericClass<String>();
		obj1.display("met ioe bkc");
		System.out.println(obj1.accept());

	}

}

package org.tnsif.thiskeyword;

class Math
{
	int a,b;
	Math()
	{
		a=10;
		b=20;
	}
	Math accept()
	{
		return this;
	}
	void display()
	{
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
	}
}
public class thiskeywordrunner {

	public static void main(String[] args) {
		Math m=new Math();
		m.accept().display();

	}

}

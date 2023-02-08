package org.tnsif.thiskeyword;

class account{

int a;
int b;
public void setdata(int a,int b) {
	this.a=a;
	this.b=b;
	
}
public void showdata() {
	System.out.println("Value of A ="+a);
	System.out.println("Value of B =" +b);
}
}
public class thiskeyworddemo {
	public static void main (String args[])
	{
		account obj=new account();
		obj.setdata(2, 5);
		obj.showdata();
	}
}






package org.tnsif.thiskeyword;

class HR
{
	void display(HR obj) {
		System.out.println("human resource");
	}
	void accept()
	{
		display(this);
	}
}
public class thiskeywordexecuter{
	

	public static void main(String[] args) {
		HR obj=new HR();
		obj.accept();
	}
}


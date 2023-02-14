package org.tnsif.exceptionhandlingdemo;

//to demonstrate on throw and throws
public class ThrowDemo {
	
	//method definition
	// throws is used to declare an exception
	public static void  donate(int age,int weight) throws Exception
	{
		if (age>18 && weight>50) {
			System.out.println("eligible");
		}else {
			
			//to throw an exception explicitly 
			throw new Exception("not eligible");
		}
	}
	
	public static void main(String[] args) {
		try {
			
			//method call
			donate(19,55);
		}
		catch(Exception e){
			System.out.println("Exception handle");
		}

	}

}

package org.tnsif.customexception;

import java.util.Scanner ;
public class CustomExceptionExecuter {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String id=s.nextLine();
	
		String password=s.nextLine();
		try
		{
			
			if(id.equals("gatamitisage@gmail.com") && password.equals("abc@123"))
			   
			{
				System.out.println("credential matched");
			}
			else
			{
				   throw new logincredential("invalid credential");
			}
		}
		catch(logincredential e)
		{
			System.out.println("Exception Handled "+e);
		}
		finally {
			System.out.println("Finally block");
		}
	}

}

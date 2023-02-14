package org.tnsif.exceptionhandlingdemo;
//prog to demo on when finally blk is not executed
public class FinallyBlockDemo {

	public static void main(String[] args) {
		
		
		try {
			
			int arr[]=new int [] {101,23,45};
			System.out.println("C2TC");
			//1.when it calls to system.exit(0)
			
			System.out.println(arr[3]);
		
		}
		catch (Exception e)
		{
			System.out.println("Exception handled: "+e );
			
		}
		finally
		{
			//when finally blk contains exceptions
			int res=10/0;
			//System.exit(0);
			System.out.println(res);
			System.out.println("Finally blocked");
		}
	}

}

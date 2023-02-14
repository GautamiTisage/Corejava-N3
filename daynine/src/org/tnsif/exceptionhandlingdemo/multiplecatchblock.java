package org.tnsif.exceptionhandlingdemo;

public class multiplecatchblock {

	public static void main(String[] args) {
		String[] s= {"abc","123", null, "xyz"};
		for (int i=0;i<5;i++)
		{
			try
			{
				int a=s[i].length()+Integer.parseInt(s[i]);
			}
			catch(NumberFormatException e)
			{
				System.out.println("handles NumberFormatException "+e);
			}
			catch(NullPointerException a)
			{
				System.out.println(" handles NullPointerException "+a);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println(" handles ArrayIndexOutOfBoundsException "+e);
		}

	}
	}
}

package org.tnsif.multithreading;
import java.lang.Thread;
public class Thredingdemo {
         
		public static void main (String args[])
		{
			Thread t=Thread.currentThread();
			System.out.println("curent thread :" +t);
			try 
			{
				Thread.sleep(1);
			}
			catch (InterruptedException e)
			{
				System.out.println("main thread interupted");
			}
		}
}

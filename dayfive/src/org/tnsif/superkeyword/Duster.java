package org.tnsif.superkeyword;

public class Duster extends Renault{
 
	protected int speed=120;
	protected void print() {
		
		super.print();
		System.out.println("the speed of duster is: "+speed+" km/hr" );
	}
}

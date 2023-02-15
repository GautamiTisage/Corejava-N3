package org.tnsif.customexception;

//program demonstrate on custom exception
public class logincredential extends Exception{

	private String str;

	//parameterized constructor
	public logincredential(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "logincredential [str=" + str + "]";
	}

	
}

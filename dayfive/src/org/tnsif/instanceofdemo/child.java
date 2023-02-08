package org.tnsif.instanceofdemo;

public class child extends persoon{

	
	private int age;

	//getters and setters 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//default 
	public child() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized
	public child(String name, String address, int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	
	
	
}

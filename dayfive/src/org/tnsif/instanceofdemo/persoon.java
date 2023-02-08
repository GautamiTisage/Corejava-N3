package org.tnsif.instanceofdemo;

public class persoon {
	
	//data members
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	
	//getters and setters
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//default constructor 
	public persoon() {
		System.out.println("parent class");
	}
	
	//parameterized 
	public persoon(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "persoon [name=" + name + ", address=" + address + "]";
	}
	
	
	
}

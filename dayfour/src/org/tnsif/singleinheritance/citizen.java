package org.tnsif.singleinheritance;

//to demonstrate on single level inheritance
public class citizen {
	
	//data members
	private String name;
	private String adharno;
	private String city;
	private long mbno;
	
	//getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	
	//parameterized constructor
	public citizen(String name, String adharno, String city, long mbno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.city = city;
		this.mbno = mbno;
	}
	
	//default constructor
	public citizen() {
		System.out.println("parent class");
	
	
	}
	
	@Override
	public String toString() {
		return "citizen [name=" + name + ", adharno=" ;
	}
}

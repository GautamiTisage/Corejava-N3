package org.tnsif.classandoblect;

public class customer {
	private int id;
	private String Customer;
	private String city;
	// default constructor
	public customer() {
		}
	//parameterized constructor
	public customer(int id, String Customer, String city) {
		this.id=id;
		this.Customer=Customer;
		this.city=city;
	}
	void display()
	{
		System.out.println(id+" "+Customer+" " +city+" ");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer() {
		return Customer;
	}
	public void setCustomer(String customer) {
		Customer = customer;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

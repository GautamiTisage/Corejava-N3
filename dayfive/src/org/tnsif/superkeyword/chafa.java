package org.tnsif.superkeyword;

public class chafa extends flower{
	
	 private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public chafa() {
		super();
		
	}

	public chafa(String name) {
		super();
		this.name = name;
	}
	 
	public void display() {
		System.out.println("name");
		super.setFlowername("flower");
		System.out.println(super.getFlowername());
	}
	
		
}

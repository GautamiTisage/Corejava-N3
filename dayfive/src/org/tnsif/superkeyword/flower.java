package org.tnsif.superkeyword;

public class flower {

	
	private String flowername;

	//getters and setters 
	public String getFlowername() {
		return flowername;
	}

	public void setFlowername(String flowername) {
		this.flowername = flowername;
	}

	
	//default 
	public flower() {
		System.out.println("flower -parent class");
	}
	
	
	//parameterized
	public flower(String flowername) {
		super();
		this.flowername = flowername;
	}
	
	
}

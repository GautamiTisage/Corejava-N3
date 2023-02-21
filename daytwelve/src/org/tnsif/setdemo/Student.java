package org.tnsif.setdemo;
//prog to demo 
public class Student {
	
	//data mmebers
	private int rollno;
	private String name;
	private float percentage;
	
	//parameterized constructor
	public Student(int roll, String name, float percentage) {
		super();
		this.rollno = roll;
		this.name = name;
		this.percentage = percentage;
	}
// getters and setters
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	

}

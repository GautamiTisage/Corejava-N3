package org.tnsif.singleinheritance;

public class student extends citizen{
	
	// data members
	private int rollno;
	private String studname;
	
	// getters and setters method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	
	
	//default constructor
	public student() {
		super();
		// super means calls citizen
	}
	
	
	// parameterized constructor
	
	public student(String name, String adharno, String city, long mbno, int rollno, String studname) {
		super(name, adharno, city, mbno);
		this.rollno = rollno;
		this.studname = studname;
	}
	
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", studname=" + studname + ", getRollno()=" + getRollno()
				+ ", getStudname()=" + getStudname() + ", getName()=" + getName() + ", getAdharno()=" + getAdharno()
				+ ", getCity()=" + getCity() + ", getMbno()=" + getMbno() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}

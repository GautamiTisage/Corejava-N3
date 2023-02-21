package org.tnsif.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExecutor {
	
	//user define method
	public static void addstudent(Set<Student>obj)
	{
		Student student1=new Student(101,"gautami", 99.77f);
		Student student2=new Student(102,"riddhi", 88.88f);
		Student student3=new Student(103,"siddhi", 77.7f);
		Student student4=new Student(104,"prajakta", 66.66f);
		obj.add(student1);
		obj.add(student2);
		obj.add(student3);
		obj.add(student4);
		
	}
	//main method
	public static void main(String[] args) {
		Set<Student>obj=new LinkedHashSet<>();
		addstudent(obj);
		for(Object o:obj)
		System.out.println(o);
		
		
	}
}

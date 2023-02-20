package org.tnsif.classandoblect;
import java.util.Scanner;
public class customerdemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in); 
		System.out.println("enter id,cusname,city");
		int id;
		String city,Cusname;
		id=sc.nextInt();
		sc.nextLine();
		
		Cusname=sc.nextLine();
		city=sc.nextLine();
		
		customer c=new customer();
		c.setId(id);
		c.setCustomer(Cusname);
		c.setCity(city);
		//c.display();
		System.out.println(c.getId());
		System.out.println(c.getCustomer());
		System.out.println(c.getCity());
	
	}

}

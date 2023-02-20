package org.tnsif.accessspecifierdemo;

public class acessspecifierexample {

		//data members
		private String name;
		//if any data mem is default it will acess only in the same package */
		public void display()
		{
			System.out.println("the name is: "+name);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}



package org.tnsif.staticdemo;

public class staticvariable {
	//non-static variable
		private String name;
		
		//static variable
		public static String companyName="TechnoServe India";

		public staticvariable(String name) {
			super();
			this.name = name;
		}

		@Override
		public String toString() {
			return "staticvariable [name=" + name + "]";
		}

	
		}



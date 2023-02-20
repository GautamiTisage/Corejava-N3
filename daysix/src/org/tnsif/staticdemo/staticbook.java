package org.tnsif.staticdemo;

public class staticbook {
	//non-static variable
		private int num;
		//static variable
		private static String name;
		
		
		//getters and setters
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}

		public static String getName() {
			return name;
		}

		public static void setName(String name) {
			staticbook.name = name;
		}

		//static block
		/*static block is used to initialise static variable*/
		static
		{
			name="Ganesh";
		}

		
	}

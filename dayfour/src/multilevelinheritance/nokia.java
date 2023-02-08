package multilevelinheritance;

//to demonstrate multilevel inheritance
//parent class
public class nokia {
	
	    //data members
		private int modelno;
		public void display() {
			System.out.println("the model no. is:");
		}
		//default 
		public nokia() {
			System.out.println("Nokia class");
		}
		//parameterized
		public nokia(int modelno) {
			super();
			this.modelno = modelno;
		}
		//getters and setters
		public int getModelno() {
			return modelno;
		}
		public void setModelno(int modelno) {
			this.modelno = modelno;
		}
		
}

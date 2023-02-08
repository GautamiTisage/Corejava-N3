package multilevelinheritance;

//child class 1
public class andriod extends nokia{

		private String version;
		public void accept() {
			System.out.println("the andriod version is: "+version);
		}
		
		//getters setters
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		//default 
		public andriod() {
			super();
			// TODO Auto-generated constructor stub
		}
		//parameterized
		public andriod(String version) {
			super();
			this.version = version;
		}

				
}

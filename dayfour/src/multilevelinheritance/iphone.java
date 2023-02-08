package multilevelinheritance;

public class iphone extends andriod {

		private String slottype;
		public void slotetype()
		{
			System.out.println("slottype is: "+slottype);
		}
		public String getSlottype() {
			return slottype;
		}
		public void setSlottype(String slottype) {
			this.slottype = slottype;
		}
		public iphone() {
			super();
			// TODO Auto-generated constructor stub
		}

		public iphone(int modelno,String version, String slottype) {
			super();
			this.slottype = slottype;
		}
		@Override
		public String toString() {
			return "iphone [slottype=" + slottype + ", getVersion()=" + getVersion() + ", getModelno()=" + getModelno()
					+ "]";
		}
		
		
}

package org.tnsif.encapsulationdemo;

public class HDFC {
		//data members 
		private int pin;
		
		void accept()
		{
			System.out.println("the ATM pin is "+pin);
		}

		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}
		
}

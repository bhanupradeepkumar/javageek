package pg.two;


public class ConstructorCheck {
	public static void main(String[] args) {
		Booking b1 = new Booking(2048, "ola", "Guntur", "vijayawada");
		
	}
	
	class Booking{
		int cabNumber;
		String cabName;
		String  pickUp;
		String  dropPoint;
		
		void book() {
			System.out.println("cab is booked");
			
		}
		void cancl() {
			System.out.println("cab is cancelled");
		}
		public Booking(int cabNumber, String cabName,String pickUp,String dropPoint) {
			super();
			this.cabNumber = cabNumber;
			this.cabName = cabName;
			this.pickUp = pickUp;
			this.dropPoint = dropPoint;
		}
		
		void showCab() {
			System.out.println("cabnum :"+cabNumber);
			System.out.println("cab name :"+cabName);
			System.out.println("pickup :"+pickUp);
			System.out.println("destination :"+dropPoint);
		}
	}

}


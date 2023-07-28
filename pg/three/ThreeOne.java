package pg.three;

import pg.four.*;

public class ThreeOne {
	public int Rent =5000;
	protected int proRent =4000;
	private int priRent = 2000;
	int deRent = 4700;
	

	
	public void hellothreeone(){
		System.out.println("i think its okay.. to be here ");
		System.out.println("derent :"+deRent);
		System.out.println("rent "+Rent);
		FourOne poi = new FourOne();
		poi.difpack();
		
		
	}

}

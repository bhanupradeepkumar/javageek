package kpitdcs;

public class customerinfoofpg {
	public static void main(String[] args) {
		nakshatraPg bhanu = new nakshatraPg();
		bhanu.setDetailsPg(5000, "bhanu", 3000, 1500);
		bhanu.showDetailsPg();
			
	}

}

class nakshatraPg{
	private int rent ;
	private String name;
	private int  messfee;
	private int currentBill;
	
	void setDetailsPg(int ren,String nam,int mesfe,int cBill) {
rent = ren ;
name = nam;
messfee = mesfe;
currentBill = cBill;
}
	void showDetailsPg() {
		System.out.println("rent :"+rent);
		System.out.println("name :"+name);
		System.out.println("messfee :"+messfee);
		System.out.println("current bill :"+currentBill);
	}
}

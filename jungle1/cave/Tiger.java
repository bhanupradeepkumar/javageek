package jungle1.cave; //must be the first line if issued

public class Tiger { //Tiger.java

	private   int privateA=10;
	protected int protectedB=20;
	public    int publicC=30;
	          int defaultD=40;
	          
	          
	public void roar() {
		System.out.println("Tiger is jumping....");
		System.out.println("privateA   : "+privateA);
		
		System.out.println("protectedB : "+protectedB);
				
		System.out.println("publicC    : "+publicC);
				
		System.out.println("defaultD   : "+defaultD);
	}
	void hunting() {
		System.out.println("Tiger is hunting...");
	}
}

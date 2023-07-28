package jungle.cave;

public class Tiger {
	
	private   int privateA=10;
	protected int protectedB=20;
	public    int publicC=30;
	          int defaultD=40;
	public void roar() {
		System.out.println("Tiger is roaring...");
		System.out.println("publicC    : "+publicC);
	}

}

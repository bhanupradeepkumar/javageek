package jungle1.cave;

public class Bear { //Bear is a non child of Tiger

	void searchingHoney() {
		Tiger tiger = new Tiger();
			tiger.roar();
			//System.out.println("privateA   : "+tiger.privateA);
			
			//available even - non-child, but same package 
			//System.out.println("protectedB : "+tiger.protectedB);
			
			//System.out.println("publicC    : "+tiger.publicC);
			
			//same package
			//System.out.println("defaultD   : "+tiger.defaultD);

	}
}


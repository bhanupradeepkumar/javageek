package jungle1.tree;

import jungle1.cave.Tiger;

public class WhiteTiger extends Tiger {

	void roaringBengalTiger() {
		
		Tiger t = new Tiger(); //another tiger here
		
		System.out.println("privateA   : "+t.privateA);
		
		//available even - non-child, but same package 
		System.out.println("protectedB : "+protectedB);
		System.out.println("protectedB : "+t.protectedB);
		
		
		System.out.println("publicC    : "+t.publicC);
		
		//same package
		System.out.println("defaultD   : "+t.defaultD);

		
		
	}
}
package jungle1.tree;

import jungle1.cave.Tiger;



public class Monkey  {

	void roaringBengalTiger() {
		Tiger tiger = new Tiger();
		
//		System.out.println("privateA   : "+tiger.privateA);
		
		//available even - non-child, but same package 
//		System.out.println("protectedB : "+tiger.protectedB);
		
		System.out.println("publicC    : "+tiger.publicC);
		
		//same package
//		System.out.println("defaultD   : "+tiger.defaultD);

		
	}
}
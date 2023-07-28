package jungle1.house; //MUST BE THE FIRST LINE

import jungle1.river.Fish;//AVAIL THE CLASS (TOKEN)
import jungle1.cave.*; //avail all the classes from cave, Tiger and Lion

public class FarmHouse { //non-child - diff package
	public static void main(String[] args) { //ENTRY POINT of your application
		
		System.out.println("The main method is in FarmHouse");
		
		Tiger tiger = new Tiger();
		tiger.roar();
//		System.out.println("privateA   : "+tiger.privateA);
//		System.out.println("protectedB : "+tiger.protectedB);
		System.out.println("publicC    : "+tiger.publicC);
//		System.out.println("defaultD   : "+tiger.defaultD);

		
		Cat myCat1 = new Cat();
		myCat1.meow();
		myCat1.drinkMilk();
		myCat1.chaseMice();
		
		Cat myCat2 = new Cat();
		myCat2.meow();
		myCat2.drinkMilk();
		myCat2.chaseMice();
		
		Fish theFish = new Fish();
		theFish.swim();//The method swim() from the type Fish is not visible
		
	}
}

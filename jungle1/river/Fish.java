package jungle1.river;

public class Fish { // public mean the Token (Fish) is available throughout the project/internet
	 public void swim() {
		System.out.println("Fish is swimming....");
	}
}

class Fisherman {
	void fishing() {
		Fish fish1 = new Fish(); 
		fish1.swim(); //can avail it even if it is not public
	}
}
package world.jungle.river;

public class Fish { //public means available throughout the project
     public void swim(){
        System.out.println("no one see me iam under water..");
    }



}

class FisherMan{
void fishing(){
    Fish f1 = new Fish();
    f1.swim();
}
}

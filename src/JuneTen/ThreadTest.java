package JuneTen;

public class ThreadTest {
    public static void main(String[] args) {
        Train t1 = new Train("vande bharat");
        t1.start();
        Car c1 = new Car("Skoda");
        Thread t2 = new Thread(c1);
        t2.start();



    }
}

class Train extends Thread{
    String model;
    Train(String model){
        System.out.println("constructor of train started..");
        this.model=model;

    }
    public void run(){
        int i=20;
        do{
            System.out.println(model+" train is running :");
        }while(i>20);
    }
}

class Vehicle{

}

class Car extends Vehicle implements Runnable{
    String model;
    Car(String model){
        this.model =model;
    }
    public void run(){
        for(int i=0;i<49;i++){
            System.out.println(model+"is running...");

        }
    }
}



package JuneSeven;



public class ConstructorTest {
    public static void main(String[] args) {
Flight flightObj1 = new Flight(2182,"Emirates","hyderabad","Houston");
flightObj1.showFlight();
flightObj1.setFlight(8242,"indigo","vijayawada","delhi");
flightObj1.showFlight();

flightObj1.flightNumber=9000;

        flightObj1.showFlight();


    }
}

class Flight{
    int flightNumber;
    String flightName;
    String source;
    String destination;

//    Flight(){
//        System.out.println("hello iam air india...");
//    }

   public   Flight(int flightNumber,String flightName,String source,String destination){
        super();
        this.flightNumber=flightNumber;
        this.flightName = flightName;
        this.source=source;
        this.destination=destination;
       System.out.println("____________");
    }

     void setFlight(int flightNumber,String flightName,String source,String destination){
         System.out.println("set flight invoked.."+flightNumber);
       this.flightNumber= flightNumber;
        this.flightName=flightName;
        this.source=source;
        this.destination=destination;
    }

    void showFlight(){
        System.out.println(flightNumber);
        System.out.println(flightName);
        System.out.println(source);
        System.out.println(destination);
    }
}


//constructor is a special function which is used
//to initialize objects of a class when u create member or variable of
//class time you call that variable as an object .
//to initialize the object u construct the object to initialize the
//data members u need something called as constructor
//a function which has same name is  called constructor
//they don't have any return type they just take parameters
//which are used to initialize the members of that particular object
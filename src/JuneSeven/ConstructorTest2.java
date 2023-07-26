package JuneSeven;

public class ConstructorTest2{
    public static void main(String[] args) {
//FlightTest fobj1 = new FlightTest(100,"Air India","vijayawada","houston");
//fobj1.showInfo();
//fobj1.setInfo(-20,"Indigo","vijayawada","houstons");
//fobj1.showInfo();

        FlightTest fobj1 = null;
        try{
            fobj1 = new FlightTest(100,"Air India","vijayawada","houston");
            fobj1.showInfo();
        }catch(RuntimeException e){
            System.out.println("problem :"+e);
        } finally {
            System.out.println("flight obj1 :"+fobj1);
        }

        fobj1.setInfo(218242,"Pradeep Jet","Guntur","Maldives");
fobj1.showInfo();

    }
}

class FlightTest{
   private  int flightNumber;
    private String flightName;
  private   String source;
   private  String destination;
   void fly(){
       System.out.println("flight is flying..");
   }

   void landing(){
       System.out.println("flight is landing...");
   }

   FlightTest(){
       System.out.println("flight invoked..");
   }
    public FlightTest(int flightNumber,String flightName,String source,String destination){
        System.out.println("starting the constructor..");
        System.out.println("checking the flight number ");
        if(flightNumber<0){
            System.out.println("cant be negative ");
            throw new RuntimeException("flight number cant be less than zero");
        }
        else{
            System.out.println("setting the flight number...");
            this.flightNumber=flightNumber;
        }
        System.out.println("checking the flight name ");
        if(flightName.equalsIgnoreCase("Air India")||flightName.equalsIgnoreCase("Indigo")){
            System.out.println("setting the flight name...");
            this.flightName=flightName;

        }
        else {
            throw new RuntimeException("flight name not found ..");
        }
        System.out.println("checking the source..");
        if(source.equalsIgnoreCase("vijayawada")){
            System.out.println("setting th source..");
            this.source=source;
        }
        else{
            throw  new RuntimeException("SOURCE MUST BE vijayawada");
        }
        System.out.println("checking the destination...");
        if(destination.equalsIgnoreCase("houston")){
            System.out.println("setting the destination ..");
            this.destination=destination;
        }
        else{
            throw new RuntimeException("your sister is there u must go there ");
        }
        System.out.println("finishing the constructor ...");
    }

    void showInfo(){
        System.out.println(flightNumber);
        System.out.println(flightName);
        System.out.println(source);
        System.out.println(destination);
    }

    void setInfo(int flightNumber,String flightName,String source,String destination){
        this.flightNumber=flightNumber;
        this.flightName=flightName;
        this.source=source;
        this.destination=destination;
    }
}
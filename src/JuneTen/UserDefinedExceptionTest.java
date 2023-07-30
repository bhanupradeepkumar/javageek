package JuneTen;

public class UserDefinedExceptionTest {
    public static void main(String[] args) {
        System.out.println("main started...");
            try{
                Mycar myCar = new Mycar();
                myCar.stopTheEngine();
            }
            catch (CarKeyNotFoundException ex1){
                System.out.println("problem1 :"+ex1);
                System.out.println("Go and search for key");
            }
catch (RedLightDishonourException ex2){
    System.out.println("problem 2 :"+ex2);
    System.out.println("pay the challan");
}
            catch (TyrePunctureNotFoundException ex3){
                System.out.println("problem 3 :"+ex3);
                System.out.println("search for the repair shop ");
            }
        System.out.println("main finished..");
    }
}

class Mycar{
    boolean keyFound = false;
    Mycar()  throws CarKeyNotFoundException{ //capability since it is check category..
        double val = Math.random()%10;
        if(val>0.50){
            keyFound=true;
            openTheCarDoor();

        }
        else{
            keyFound=false;
            CarKeyNotFoundException cark1 = new CarKeyNotFoundException("oh...no where is the key");
            throw cark1;  //literally throwing it action..
        }
    }

    void openTheCarDoor(){
        System.out.println("opened the door..");
        startTheEngine();
        longDrive();
    }
    void startTheEngine(){
        System.out.println("started the engine of car ...");
    }
    void stopTheEngine(){
        System.out.println("stopped the car...");
    }

    void longDrive(){
        //throws clause is not mandatory since the RedSignalDishonouredException,TyrePuncturedException are UNCHECKED

        System.out.println("long drive started....");
        for(int i=1;i<=10;i++){
            System.out.println("started driving...");

            double value = Math.random()%10;
            if(value >0.97 && value<0.99){
                RedLightDishonourException red1 = new RedLightDishonourException("oh..no red signal is dishonoured..");
                throw red1; // it is not required to keep it in throws clause
            }
            if(value>0.25 && value<0.27){
                TyrePunctureNotFoundException tir1 = new TyrePunctureNotFoundException("oh..shut tyre is punctured slow down");
                throw tir1;
            }

        }
        System.out.println("long drive over");
    }


}


class CarKeyNotFoundException extends Exception{
    CarKeyNotFoundException(String msg){
        super(msg);
    }
}
class RedLightDishonourException extends RuntimeException{
    RedLightDishonourException(String msg){
        super(msg);
    }
}

class TyrePunctureNotFoundException extends RuntimeException{
    TyrePunctureNotFoundException(String msg){
        super(msg);//forwards msg to super class
    }
}
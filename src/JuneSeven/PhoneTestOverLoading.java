package JuneSeven;

public class PhoneTestOverLoading {
    public static void main(String[] args) {

        PhoneDial p1 = new PhoneDial();
        p1.dial();
       byte inter =127;
       p1.dial(inter);//p1.phone.dial(byte)
        p1.dial("Nanna");
byte speedDial1 = 1;
byte speedDial2= 2;

p1.dial(speedDial1,speedDial2);

p1.dial(speedDial1,"Amma");
p1.dial("Eswar",speedDial2);




    }
}
///function overloading...............
class PhoneDial{
    void dial(){
        System.out.println("dialing without arguments  nowhere...");
    }
    void dial(byte num){
        System.out.println("dialing to the number :"+num);
    }

    void dial(byte num1,byte num2){
        System.out.println("conference call with :"+num1+"and"+num2);
    }
    void dial(String name ){
        System.out.println("calling to the :"+name);
    }
    void dial(byte num,String name){
        System.out.println("dial(byte,string):dialing a conference with "+num+"with name "+name);
    }
    void dial(String name,byte num){
        System.out.println("dialing a a conference :"+name+"with no."+num);
    }
}
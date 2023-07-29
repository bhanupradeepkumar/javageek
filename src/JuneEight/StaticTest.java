package JuneEight;

public class StaticTest {
    public static void main(String[] args) {
        KiteCount.showKiteCount();

        KiteCount k1 = new KiteCount("red",3,"bhanu",true);
        KiteCount.showKiteCount();

        KiteCount k2 = new KiteCount("blue",4,"pradeep",false);
        KiteCount.showKiteCount();

        k1.show();
        k2.show();



    }
}

class KiteCount{
    private String colour;
    private int length;
    private String Owner;
    private boolean flying;

    private static int kiteCount;
    public static void showKiteCount(){
        System.out.println("kite count.."+kiteCount);
    }
    public KiteCount(String colour,int length,String Owner,boolean flying){

        this.colour=colour;
        this.length=length;
        this.Owner=Owner;
        this.flying=flying;
        ++kiteCount;
    }
    void show(){
        System.out.println("colour:"+colour);
        System.out.println("length:"+length);
        System.out.println("owner :"+Owner);
        System.out.println("flying :"+flying);

    }

}

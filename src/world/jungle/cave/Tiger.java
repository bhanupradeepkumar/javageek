package world.jungle.cave;

import world.jungle.house.FarmHouse;

public class Tiger  {
    private int privateA =10;
    protected int protectedA=20;
    public int publicA =30;
            int defaultA= 40;
    public void Run(){
        System.out.println("iam indian national animal...");
        System.out.println("private :"+privateA);
        System.out.println("protected :"+protectedA);
        System.out.println("public :"+publicA);
        System.out.println("default :"+defaultA);
    }
}

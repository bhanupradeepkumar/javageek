package JuneEight;

public class JuneEight {
    public static void main(String[] args) {

        GrandFather g1 = new GrandFather();
        System.out.println(g1.age);
        g1.farming();
        Father f1 = new Father();
        System.out.println(f1.age);
        System.out.println(f1.salary);
        f1.farming();
        Children c1 = new Children();
        System.out.println(c1.marks);
        c1.farming();
    }
}
class GrandFather{
    int age;

    GrandFather(){
        System.out.println("grand pa says nanna");
    }
    void farming(){
        System.out.println("i just saled 2 acres for 2000");
    }
}


class Father extends GrandFather{
int salary ;
Father(){
    System.out.println("nanna says kanna");
}
void farming(){
    System.out.println("i just bought 1 acre with my year salary ");
}
}

class Children extends Father{
    int marks;
    Children(){
        //output
        //beacuse in every constructor first line is hidden with super();
        // grand pa says nanna
        //nanna says kanna
        //kanna says amma
        System.out.println("kanna says amma");
    }
    void farming(){
        System.out.println("what is meant by farming...");
    }
}

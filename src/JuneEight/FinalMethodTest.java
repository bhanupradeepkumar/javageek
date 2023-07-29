package JuneEight;

public class FinalMethodTest {
    public static void main(String[] args) {

        Chess c1 = new Chess();
       c1.moveBishop();
GraphicalChess c2 = new GraphicalChess();
c2.moveBishop();
c1.moveBishop();
    }
}

class Chess{
    void moveBishop(){
        System.out.println("Moving bishop mathematically...");
    }
}

final class GraphicalChess extends Chess{
    final void moveBishop(){
        super.moveBishop();
        System.out.println("moving bishop graphically");
    }
}

class WebGraphicalChess{
    void moveMyBishop(){
        System.out.println("moving on web page");
    }
}

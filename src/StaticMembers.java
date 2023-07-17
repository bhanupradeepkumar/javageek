public class StaticMembers {
    public static void main(String[] args) {
Player p1 = new Player("bhanu");
Player p2 = new Player("pradeep");
        Player p3 = new Player("gokul");
        Player p4 = new Player("vijay");
        System.out.println(Player.player_count);
        System.out.println(p1.player_count);
p1.printPlayerDetails();
p2.printPlayerDetails();
p3.printPlayerDetails();
p4.printPlayerDetails();

    }
}
class Player{
    int id;
    static int player_count=0;//used as same for different objects
    String name;
    Player(String name){
        this.name= name;
        id =++player_count;
    }
    void printPlayerDetails(){
        System.out.println(id+":"+name);
    }
}
package JuneSix;

public class CricketerTest {
    public static void main(String[] args) {
 //    int      score[] = new int   [5];
        Cricket india[] = new Cricket[11];  //11 references in 1 shot
        india[0] = new Cricket(); //real instance creation process is here
        india[1] = new Cricket(); //real instance creation process is here
        india[2] = new Cricket(); //real instance creation process is here
        india[3] = new Cricket(); //real instance creation process is here
        india[4] = new Cricket(); //real instance creation process is here

        india[0].setCricketerDetails(1,"virat kohli",189,38);
        india[0].showCricketerDetails();
        india[1].setCricketerDetails(2,"ab",149,43);
        india[1].showCricketerDetails();
        india[2].setCricketerDetails(3,"rohit",264,39);
        india[3].setCricketerDetails(4,"kl rahul",50,29);
        india[4].setCricketerDetails(5,"shreyas iyer",129,28);

//        india[0].showCricketerDetails();
for(int i=0;i<4;i++){
    india[i].showCricketerDetails();
}
    }
}

class Cricket{
    int ranking;
    String name;
    int highestScore;
    int age ;

    void setCricketerDetails(int ranking,String name,int highestScore,int age){
        this.ranking = ranking;
        this.name=name;
        this.highestScore=highestScore;
        this.age=age;
    }
    void showCricketerDetails(){
        System.out.println("ranking :"+ranking);
        System.out.println("name :"+name);
        System.out.println("highest score :"+highestScore);
        System.out.println("age :"+age);

    }

}

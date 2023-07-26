package JuneSix;
import java.util.Scanner;

public class MenuTest {
    public static void main(String[] args) {
        System.out.println("M E N U");
        System.out.println("---------");
        System.out.println("1.search");
        System.out.println("2.sort");
        System.out.println("3.insert");
        System.out.println("4.update");
        System.out.println("5.delete");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice>=11 && choice<=15){
            System.out.println("searching....");
        }
        else if(choice ==2){
            System.out.println("sorting...");
        }
        else if(choice ==3){
            System.out.println("inserting...");
        }
        else if(choice==4){
            System.out.println("updating...");
        }
        else if(choice ==5){
            System.out.println("Deleting....");
        }else {
            System.out.println("invalid choice..not found");
        }
    }
}

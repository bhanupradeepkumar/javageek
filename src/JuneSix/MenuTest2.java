package JuneSix;

import java.util.Scanner;

public class MenuTest2 {
    public static void main(String[] args) {
        int choice =0;


        do{
        System.out.println("MENU SWITCH...");
        System.out.println("--------");
        System.out.println("1.Insert...");
        System.out.println("2.Update...");
        System.out.println("3.Delete....");
        System.out.println("4.Create....");
        System.out.println("15.searching...");
        System.out.println("6.Exit...");
        Scanner sc = new Scanner(System.in);
         choice = sc.nextInt();
         switch(choice){
             case 1:
                 System.out.println("inserting...");break;
             case 2:
                 System.out.println("updating...");break;
             case 3:
                 System.out.println("deleting...");break;
             case 4:
                 System.out.println("creating...");break;
             case 15:
                 System.out.println("searching...");break;
             case 6:
                 System.out.println("exiting...");break;
             case 5:
             default:
                 System.out.println("invalid input...");break;
         }
         }while(choice!=6);
            System.out.println("end of main..");
        }
    }



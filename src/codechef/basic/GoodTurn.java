package codechef.basic;



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GoodTurn
{
    public static void main(String[] args) throws Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0;i<T;i++){
            int X = scan.nextInt();
            int Y = scan.nextInt();
            if((X+Y) > 6){
                System.out.println("YES");
            }
            else if((X+Y)<6){
                System.out.println("NO");
            }
            else{
                System.out.println("NO");
            }
        }


    }
}


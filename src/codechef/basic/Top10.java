package codechef.basic;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Top10
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i < T; i++){
            int X = sc.nextInt();
            if(X<=10){
                System.out.println("Yes");
            }
            if(X>10){
                System.out.println("No");
            }
        }
    }
}




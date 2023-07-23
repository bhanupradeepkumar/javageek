package codechef.arrays;
import java.util.Scanner;

public class BeginnerFriendly {
    //take input from user as how many test cases
    //each test case has 2 line of inputs
    //first line of input has total no of problems to add in code cheff
    // 2 line has separted integrs with difficult rating
    //if greater than 1000 cheff has to remove

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i=0;i<N;i++){
        int AddCheff = sc.nextInt();
        int ArrDifRat[] = new int[AddCheff];
        int removeCount =0;
        for(int j=0;j<AddCheff;j++){
            ArrDifRat[j] = sc.nextInt();
            if(ArrDifRat[j]>=1000){
                removeCount++;
            }
        }
        System.out.println(removeCount);
    }
    }
}

///* package codechef; // don't place package name! */
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class Codechef
//{
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		// your code goes here
//		Scanner sc = new Scanner(System.in);
//	int T = sc.nextInt();
//		for(int i=0;i<T;i++){
//
//		int N = sc.nextInt(); //chef has to add to his to do list
//	    int diffLevel[] = new int[N];
//	    int finalOutput=0;
//		for(int j=0;j<N;j++){
//		    diffLevel[j] = sc.nextInt();
//		    if(diffLevel[j]>=1000){
//		        finalOutput++;
//		    }
//		}
//		System.out.println(finalOutput);
//		}
//
//	}
//}
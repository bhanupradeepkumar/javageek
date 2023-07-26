package com.geekforgeeks.patterns;
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
                int j =1;
                while(j<=n-i){
                    System.out.print(" ");
                    j++;
                }
                int k=1;
                while(k<=(2*i-1)){
                    System.out.print("*");
                    k++;
                }
                i++;
            System.out.println();
        }
        int l = n -1;
        while(l>0){
            int m =1;
            while(m<=n-l){
                System.out.print(" ");
                m++;
            }
            int p =1;
            while(p<=(2*l-1)){
                System.out.print("*");
                p++;
            }
            System.out.println();
            l--;
        }






    }
}
//        while(i++ <=n-i){ ///this means i<=n-i and i_++ combined
//            System.out.println(" ");
//        }  u can write this way
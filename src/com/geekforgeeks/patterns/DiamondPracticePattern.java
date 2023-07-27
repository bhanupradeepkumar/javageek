package com.geekforgeeks.patterns;
import java.util.Scanner;

public class DiamondPracticePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i =1;
        while(i<=input){
            int j=1;
            while(j<=input-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=(2*i-1)){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;


            }
        int m = input -1;
        while(m>0){
            int n =1;
            while(n<=input-m){
                System.out.print(" ");
                n++;
            }
            int l =1;
            while(l<=(2*m-1)){
                System.out.print("*");
                l++;
            }
            System.out.println();
            m--;

        }


    }
}

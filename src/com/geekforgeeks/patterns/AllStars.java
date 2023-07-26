package com.geekforgeeks.patterns;
import java.util.Scanner;

public class AllStars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        while(i<=num){
            int j=1;
            while(j<=num){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

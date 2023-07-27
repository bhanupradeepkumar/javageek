package com.geekforgeeks.patterns;

import java.util.Scanner;

public class ReverseRightAngleSpaces {
    public static void main(String[] args) {
        int n =4;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<i){
                System.out.print(" ");
                j++;
            }
            int k=i;
            while(k<=n){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}

//****
// ***
//  **
//   *
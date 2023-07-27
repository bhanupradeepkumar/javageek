package com.geekforgeeks.patterns;

import java.util.Scanner;

public class BaseFivePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
            int counter =0;
            while(k<=(2*i-1)){
                if(counter<n){
                    System.out.print("*");
                    counter++;
                }

                k++;
            }
            System.out.println();
            i++;
        }
    }
}

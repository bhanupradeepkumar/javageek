package com.geekforgeeks.patterns;

import java.util.Scanner;

public class PatternAtTheBest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter only odd number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("exit main.. u entered even numbiar...");
            System.exit(1);

        }
        int b = 1;
        int m = n / 2;  //2
        for (int i = 0; i < n; i++) {
            if (m - b < -1) {
                break;
            }
            for (int j = 0; j <= m - b; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * b - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
            b++;
        }
        int uio =1;
for(int p=0;p<=m;p++){
    for(int u=0;u<uio;u++){
        System.out.print(" ");
    }
    for(int y=0;y<(2*m-1);y++){
        System.out.print("*");

    }
    System.out.println();
    uio++;//2
    m--;//1

}



    }
}


//     n=5 [0,1,2,3,4]
//  *
// ***
//*****
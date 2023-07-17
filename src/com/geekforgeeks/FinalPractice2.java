package com.geekforgeeks;

public class FinalPractice2 {
    public static void main(String[] args) {
        final  StringBuffer sb1 = new StringBuffer("hello iam  Gorre");
        sb1.append("Bhanu Pradeep Kumar");
        System.out.println(sb1);
        //reference final variable they cant be rebound
        // but the  object they are refferring  can change there state
    }
}

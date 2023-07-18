package com.geekforgeeks.polymorphism;

public class MethodOverloading {
    public int sum(int x,int y){
        return(x+y);
    }
    public int sum(int x,int y,int z){
        return(x+y+z);
    }
    public double sum(double x,double y){
        return(x+y);

    }

    public static void main(String[] args) {
        MethodOverloading s = new MethodOverloading();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(9.0,0.97));
        System.out.println(s.sum(90,80,89));
    }

}

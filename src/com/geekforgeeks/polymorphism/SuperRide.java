package com.geekforgeeks.polymorphism;

public class SuperRide {
    public static void main(String[] args) {

        Sir s = new Master();
        s.fun();

    }
}
class Sir{
    void fun(){
        System.out.println("haha sir wont fun...");
    }

}
class Master extends Sir{
    @Override
    void fun(){
super.fun();
        System.out.println("master is laughing with madam..");
    }

}
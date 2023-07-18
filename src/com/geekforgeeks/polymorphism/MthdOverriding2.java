package com.geekforgeeks.polymorphism;

public class MthdOverriding2 {
    public static void main(String[] args) {
Based b = new Derives();
b.fun();
    }
}

class Based{
    void fun(){
        System.out.println("bases fun..");
    }

}
class Derives extends Based{
    void fun(){
        System.out.println("derives fun...");
    }
}

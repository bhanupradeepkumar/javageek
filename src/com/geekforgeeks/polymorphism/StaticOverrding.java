package com.geekforgeeks.polymorphism;

 class StaticOverrding {
    public static void main(String[] args) {
Parent1 poi = new Child1();
Parent1.fun();
Child1.fun();
    }
}
class Parent1{
    static void fun(){
        System.out.println(" parent1 fun...");
    }
}
class Child1 extends Parent1 {
    static void fun(){
        System.out.println("child1 fun..");
    }
}
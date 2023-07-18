package com.geekforgeeks.polymorphism;

public class MethodOverrideMutipleInheritance {
    public static void main(String[] args) {
        Parent p = new GrandChild();


        p.fun();
        Parent      p1  = new Child();
        //if u create a parent reference which is referencing to a child class
        //object and
        p1.fun();
    }
}
class Parent {
    void fun(){
        System.out.println("parents fun...");
    }

}
class Child extends Parent{
    void fun(){
        System.out.println("childs fun...");
    }
}

class GrandChild extends Child{
//    @Override
    void fun() {
        System.out.println("grand child fun..");
    }
}
package com.geekforgeeks;
import java.util.Scanner;

public class InterfacesExample2 {

}

interface Printable2{
    default void fun1(){
        System.out.println("fun1()");
    }
    static void fun2(){
        System.out.println("fun2()");
    }
     void fun3();
}

class Vijay implements Printable2{
    public void fun3(){
        System.out.println("fun3 is implemented...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Printable2 p2 = new Vijay(); ///reference can be created instance cant be created 
        p2.fun3();
        Vijay v = new Vijay();
        v.fun1();
        Printable2.fun2();//static method may be invoked by interface class only
        v.fun3();
    }
}

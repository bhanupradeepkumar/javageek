package com.geekforgeeks;

public class InterfacesExample {
    public static void main(String[] args) {
Exint ex = new Exint();
ex.print();
    }
}
interface Printable{
   int  x =10;
    void print();
}

class Exint implements Printable{
   public  void print(){
       System.out.println("are u acheiving abstraction...");
       System.out.println(x);
    }
}
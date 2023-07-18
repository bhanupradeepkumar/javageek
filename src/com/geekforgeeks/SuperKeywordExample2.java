package com.geekforgeeks;

public class SuperKeywordExample2 {
    public static void main(String[] args) {
        Derives d = new Derives();
        d.print();

    }

}
class Based{
    int x =10;
}
class Derives extends Based{
    int x =20;
    void print(){
        System.out.println(super.x);
        System.out.println(x);
    }
}

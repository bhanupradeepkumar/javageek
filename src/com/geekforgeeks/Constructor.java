package com.geekforgeeks;

public class Constructor{

    public static void main(String[] args){

        Complex c1 = new Complex(2,3);
        c1.print();
        Complex c2 = new Complex(4,5);
        c1.add(c2);
        c1.print();

    }



}

class Complex{

    int real,img;
    public void print(){
        System.out.println(real+"+i"+img);
    }
    Complex(int r,int i){
        real = r;
        img = i;
    }
    public void add(Complex C){
        real = real+C.real;
        img = img +C.img;
    }
}




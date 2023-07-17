package com.geekforgeeks;

public class ConstructorPractice {

    public static void main(String[] args){

        ComplexPractice c1= new ComplexPractice(2,6);
        c1.print();

        ComplexPractice c2 = new ComplexPractice(5,9);
        c1.add(c2);
        c1.print();

    }
}

class ComplexPractice{


    int real ,img ;

    public void print(){
        System.out.println(real+"+i"+img);
    }

    ComplexPractice(int r,int i){
                real = r;
                img = i;

            }
            public void add(ComplexPractice C){
                real = real+C.real;
                img = img +C.img;
            }
}

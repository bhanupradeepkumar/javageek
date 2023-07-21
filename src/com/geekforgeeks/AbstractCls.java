package com.geekforgeeks;

public class AbstractCls {
    public static void main(String[] args) {
        Square s = new Square(1289,7);
        System.out.println(s.getArea());
        s.printDetails();

    }

}
abstract class Shape{
    int color;
    int getColor(){
        return color;
    }
    Shape(int c ){
        color = c;
    }
    abstract double getArea();
}

class Square extends Shape{

    int side;
    Square(int c ,int s){
        super(c);
        side =s;
    }
    void printDetails(){
        System.out.println(color);
        System.out.println(side);
    }
    double getArea(){
        return side * side ;
    }
}


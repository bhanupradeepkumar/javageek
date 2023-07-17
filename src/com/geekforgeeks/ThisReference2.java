package com.geekforgeeks;

public class ThisReference2 {
    public static void main(String[] args){
Point2 p1 = new Point2();
p1.print();
    }
}

class Point2{
    int x,y;
    Point2(int x,int y){
        this.x = x;
        this.y =y;
    }
    Point2(){
        this(700,900);
    }
    void print(){
        System.out.println(x+","+y);
    }
}

package com.geekforgeeks;

public class ThisReference {
    public static void main(String[] args) {
        Point p1 = new Point(90,80);
        Point p2 = new Point(76,98);

        p1.print();
        p2.print();
        p1.setY(4).setX(7);
        p1.print();
        p2.print();

    }
}

class Point{
    int x,y ;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    Point setX(int x){
        this.x = x;
        return this;
    }
    Point setY(int y){
        this.y=y;
        return this;
    }
    void print(){
        System.out.println("value of x is "+x+" y is :"+y);
    }
}

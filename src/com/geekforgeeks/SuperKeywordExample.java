package com.geekforgeeks;

public class SuperKeywordExample {
    public static void main(String[] args) {
Derived d = new Derived(60,90);
        System.out.println(d.x);
        System.out.println(d.y);

    }
}
class Base{
    int x;
    Base(){
        x=0;
    }
    Base(int i){
        x=i;
    }


}
class Derived extends Base{
    int y;
    Derived(){
        super();
        y=10;
    }
    Derived(int i,int o){
        super(i);
        y=o;
    }
}
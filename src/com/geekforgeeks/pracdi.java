package com.geekforgeeks;

public class pracdi {
    public static void main(String[] args) {
        Input i1 = new Input("hello dinesh its running...");
        i1.print();

    }
}

class Input{
    String str ;
  Input(String str){
      this.str = str;
  }
  public void print(){
      System.out.println(str);
  }
}



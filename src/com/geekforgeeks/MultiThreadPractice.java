package com.geekforgeeks;

public class MultiThreadPractice {
    public static void main(String[] args){

        Teacher t1 = new Teacher(2000,"hello students");
        Student s1 = new Student(25000,6000);

        Thread ty = new Thread(t1);
        Thread to = new Thread(s1);

        System.out.println(Thread.currentThread().getId());

        ty.start();
        to.start();

    }
}


class Teacher  extends Thread{
    int salary;
    String msg;
            Teacher(int salary,String msg){
                this.salary= salary;
                this.msg = msg;
            }
            public void run(){

                int i =200;

                do{

                    i--;
                    System.out.println("salary is :"+salary+"msg is :"+msg);
                }while (i!=0);
            }

}

class Exam{}
class Student extends Exam implements Runnable{
    int fee;
    int messfee;

    Student(int fee,int messfee){
        this.fee = fee;
        this.messfee= messfee;
    }
    public void run(){
        int j=300;
        do{
            j--;
            System.out.println("fee is :"+fee+"mess fee is :"+messfee);
        }while(j!=0);
    }
}

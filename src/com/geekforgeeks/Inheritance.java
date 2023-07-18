package com.geekforgeeks;

public class Inheritance {
    public static void main(String[] args) {

        Patil c1 = new Patil(584690,80000000,"KPIT TECHNOGIES");
        Staff s1 = new Staff(218242,400050000,"KPIT",450000);
        c1.Portfolio();
        s1.Portfolio();

    }
}

class Patil{
int id;
int invest;
String companyName;
        Patil(int id,int invest,String companyName){
            this.id = id;
            this.invest=invest;
            this.companyName=companyName;
        }
        void Portfolio(){
            System.out.println(id);
            System.out.println(invest);
            System.out.println(companyName);
        }
}

class Staff extends Patil{
int salary;
    Staff(int i,int nv,String cn,int Sal){
        super(i,nv,cn);
        salary = Sal;
    }
    void SalaryDetails(){
        System.out.println(id);
        System.out.println(invest);
        System.out.println(companyName);
        System.out.println(salary);
    }

}



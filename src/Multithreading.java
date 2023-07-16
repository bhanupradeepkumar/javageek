public class Multithreading {

    public static void main(String[] args){
        Teacher t1 = new Teacher(20000,"Sidhareddy");
        Student s1 = new Student(100000,"bhanu");
        Thread ty = new Thread(t1);
        Thread tu  = new Thread(s1);

        ty.start();
        tu.start();

    }

}


class Teacher extends Thread{
    int salary;
    String name ;
    Teacher(int salary,String name){
        this.salary = salary;
        this.name = name ;
    }
    public void run(){
        int i=100;
        do{
            i--;
            System.out.println("salary of"+name+"is"+salary);
        }while (i!=0);
    }

}

class Exam{

}

class Student extends Exam implements Runnable{
    int fee;
    String nameofstudent ;
    Student(int fee,String nos){
        this.fee =fee;
        nameofstudent = nos ;
    }
    public void run(){
        int k=100;
        do{
            k--;
            System.out.println("fee structure of "+nameofstudent+"with scholarship is "+fee);
        }while (k!=0);
    }

}

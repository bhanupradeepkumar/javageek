package JuneEight;

public class SingleLevelTestIsA {
    public static void main(String[] args){
Person p1 = new Person('M',21,"Bhanu");
p1.showPerson();
Student s1 = new Student('M',24,"Pradeep",7,
        "computer science",97,'o');
s1.showStudent();

Employee e1 = new Employee('F',23,"asr",8096,"MBBS",378,'O',2984,"Dental",80000);
e1.showEmployee();

Person p2 = new Person('M',28,"Gorre","4598","11th lane","bhanu Pradeep","28052002");
p2.adhar1.showAdhaarCard();

e1.adhar1.setAdhaarCard("2345","8909","986","6789");
e1.adhar1.showAdhaarCard();




    }




}

class AdhaarCard{
    String adhaarNumber;
    String address;
    String nameOnAdhaar;
    String birthDate;
    AdhaarCard(){

    }
   public AdhaarCard(String adhaarNumber,String address,String nameOnAdhaar,String birthDate){
        this.adhaarNumber=adhaarNumber;
        this.address=address;
        this.nameOnAdhaar=nameOnAdhaar;
        this.birthDate=birthDate;
    }
    public void setAdhaarCard(String adhaarNumber,String address,String nameOnAdhaar,String birthDate){
        System.out.println("setting the adhaar details...");
        this.adhaarNumber=adhaarNumber;
        this.address=address;
        this.nameOnAdhaar=nameOnAdhaar;
        this.birthDate=birthDate;
    }
    void showAdhaarCard(){
        System.out.println("_____Adhaar Info____");
        System.out.println(adhaarNumber);
        System.out.println(address);
        System.out.println(nameOnAdhaar);
        System.out.println(birthDate);
    }
}

class Person{
    private char gender;
    private int age ;
    private String name;
    AdhaarCard adhar1;


    ////personal has a
    Person(char gender,int age, String name,String adhaarNum,String addres,String nameOnAdhar,String dob){
this.gender=gender;
this.age=age;
this.name=name;
adhar1 = new AdhaarCard(name,addres,nameOnAdhar,dob);
    }
    public Person(char gender,int age ,String name){
        super();
        this.gender=gender;
        this.age =age;
        this.name=name;
        adhar1 = new AdhaarCard();
    }

    void showPerson(){
        System.out.println("____Personal Info____");
        System.out.println("gender :"+gender);
        System.out.println("age :"+age);
        System.out.println("name :"+name);
    }

    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name ;
    }

}
class Student extends Person{
    int rollNumber;
    String stream;
    float marks ;
    char grade;

    public Student(char gender,int age,String name,int rollNumber,String stream
    ,float marks,char grade){
        super(gender,age,name);
        this.rollNumber=rollNumber;
        this.stream=stream;
        this.marks=marks;
        this.grade=grade;
    }
    void showStudent(){
        super.showPerson();//invokes nearest super class function
        System.out.println("_____Student info____");
        System.out.println("roll number :"+rollNumber);
        System.out.println("stream :"+stream);
        System.out.println("marks :"+marks);
        System.out.println("grade :"+grade);
        System.out.println("______________");
    }
}

class Employee extends Student{
    int employeeNumber;
    String designation;
    float salary;

    public Employee(char gender, int age, String name, int rollNumber, String stream, float marks, char grade, int employeeNumber, String designation, float salary) {
        super(gender, age, name, rollNumber, stream, marks, grade);
        this.employeeNumber = employeeNumber;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(char gender,String stream,float salary){
        this(gender,0,"",0,stream,0,' ',0,"",salary);
    }//invoke the 10 parameterized constructor

    void showEmployee(){

        super.showStudent();
        System.out.println("____employee info____");
        System.out.println("employee number.."+employeeNumber);
        System.out.println("designation :"+designation);
        System.out.println("salary :"+salary);
        System.out.println("___________________");

    }
}

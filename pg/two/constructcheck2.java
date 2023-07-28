package pg.two;

public class constructcheck2 {

    public static void main(String[] args) {

        student s1 = new student(34, "bhanu", 56.0, 16);

        student s2 = new student(35, "vivek", 57.0, 16);

        student s3 = new student(36, "gyan", 58.0, 16);

        student s4 = new student(37, "subham", 59.0, 16);

        s1.showstudentdetails();

        s2.showstudentdetails();

        s3.showstudentdetails();

        s4.showstudentdetails();

        student s5 = new student(39);

        s5.showstudentdetails();

    }

}

class student

{

    int roll;

    String name;

    double marks;

    int age;




    student(int roll, String nm, double mar, int ag)

    {
    	System.out.println("taking the information");
    	
    	if(roll>60)
    	{
    		System.out.println("roll no is invalid");
    	}
    	else
    	{
    		System.out.println("roll number is valid");
    	}
    	if(nm.contentEquals("bhanu") || nm.contentEquals("vivek") ||
    			nm.contentEquals("gyan") || nm.contentEquals("subham"))
    	{
    		nm.contentEquals("bhanu")
    	}

        this.roll = roll;

        this.name = nm;

        this.marks = mar;

        this.age = ag;

         

    }

    student(int i)

    {

        this.roll = i;

    }

    void showstudentdetails()

    {

        System.out.println(roll);

        System.out.println(name);

        System.out.println(marks);

        System.out.println(age);

    }





}

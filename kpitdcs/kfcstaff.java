package kpitdcs;


public class kfcstaff {
	public static void main(String[] args) {
		
		Workersdata kfcoutlet1[] = new Workersdata[6];
		
		kfcoutlet1[0] = new Workersdata();
		kfcoutlet1[1] = new Workersdata();
		kfcoutlet1[2] = new Workersdata();
		kfcoutlet1[3] = new Workersdata();
		kfcoutlet1[4] = new Workersdata();
		kfcoutlet1[5] = new Workersdata();
		
		kfcoutlet1[0].setworkersdetails(22,"vinay",20833,"dining");
		kfcoutlet1[1].setworkersdetails(50, "vivek", 15000, "cheff");
	
		kfcoutlet1[0].showworkersdetails();
		System.out.println("___________________");
		kfcoutlet1[1].showworkersdetails();
		
		for( Workersdata kfcloop: kfcoutlet1 ) {
			kfcloop.showworkersdetails();
		}
}
}

class Workersdata{
int age ;
String name;
int salary;
String type;

void setworkersdetails(int ag,String nam,int sal,String ty) {
	age = ag;
	name = nam;
	salary = sal;
	type = ty;
}
void showworkersdetails() {
	System.out.println("age :"+age);
	System.out.println("name :"+name);
	System.out.println("salary :"+salary);
	System.out.println("type :"+type);
}
}
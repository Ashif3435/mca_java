import java.util.Scanner;
class Emp{
	Scanner sn=new Scanner(System.in);
	int empid;
	String name;
	float salary;
	String address;
	int n;

	Emp(){
		for (int j=0;j<n;j++) {
		System.out.println("Enter Details of Teacher"+(j+1)+":");
	}

		System.out.println("-------------------------");
		System.out.print("Input Empid:");
		empid=sn.nextInt();
		System.out.print("enter the Name:");
		name=sn.next();
		System.out.print("enter the Salary:");
		salary=sn.nextFloat();
		System.out.print("enter the Address:");
		address=sn.next();
	}
}
class Teacher extends Emp{
	String dept;
	String sub;
	Teacher(){
		super();
		System.out.print("enter Department name:");
		dept=sn.next();
		System.out.print("enter Subject name:");
		sub=sn.next();
		System.out.println("-------------------------");
	}

	void display(){
		System.out.println("Empid:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Address:"+address);
		System.out.println("Department:"+dept);
		System.out.println("Subject:"+sub);
		System.out.println("-------------------------");

	}
}
class in_emp{
	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	int n;
	System.out.print("Enter Number of Employees:");
	n=sn.nextInt();
	Teacher tr[]=new Teacher[n];
	for (int i=0;i<n;i++) {
		tr[i]=new Teacher();
	}
	for (int i=0;i<n;i++) {
		System.out.println("Teacher\t"+(i+1)+":");
		tr[i].display();
	}
	
}
}
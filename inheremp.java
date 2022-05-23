import java.util.Scanner;
class Person{
	Scanner sn=new Scanner(System.in);
	String name,address,gender;
	int age;
	Person(){
		System.out.println("\nEnter Details of Teacher:");
		System.out.print("Enter Name:");
		name=sn.next();
		System.out.print("Enter gender:");
		gender=sn.next();
		System.out.print("Enter Address:");
		address=sn.next();
		System.out.print("Enter Age:");
		age=sn.nextInt();
	}
}
class Employee extends Person{
	int empid;
	float salary;
	String cname,quali;
	Employee(){
		super();
		System.out.print("Enter Empid:");
		empid=sn.nextInt();
		System.out.print("Enter Salary:");
		salary=sn.nextFloat();
		System.out.print("Enter Company name:");
		cname=sn.next();
		System.out.print("Enter Qualification:");
		quali=sn.next();
	}
}
class Teacher extends Employee{

	String sub;
	int tid,deptid;
	Teacher(){
		super();
		System.out.print("Enter Subject:");
		sub=sn.next();
		System.out.print("Enter Teacher Id:");
		tid=sn.nextInt();
		System.out.print("Enter Department Id:");
		deptid=sn.nextInt();
	}
	void display(){
		System.out.println("Empid:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Address:"+address);
		System.out.println("Teacher ID"+tid);
		System.out.println("Department ID:"+deptid);
		System.out.println("Qualification:"+quali);
		System.out.println("Company name:"+cname);
		System.out.println("Subject:"+sub);
	}
}
class inheremp{
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
		System.out.println("\nDetails of Teacher"+(i+1)+":");
		tr[i].display();
	}
	}
}
import java.util.Scanner;
class prouct1{
	Scanner s=new Scanner(System.in);
	int pcode;
	String pname;
	float price;
	void insert(){
		System.out.println("Enter pcode:");
		pcode=s.nextInt();
		System.out.println("Enter Name:");
		pname=s.next();
		System.out.println("Enter price:");
		price=s.nextFloat();
		}
	void display(){
		System.out.println("Product with less Price:");
		System.out.println("pcode:"+pcode);
		System.out.println("Name:"+pname);
		System.out.println("price:"+price);
	}
	}
class product{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		prouct1 p1=new prouct1();
		prouct1 p2=new prouct1();
		prouct1 p3=new prouct1();
		System.out.println("Enter Details of product 1:");
		p1.insert();
		System.out.println("Enter Details of product 2:");
		p2.insert();
		System.out.println("Enter Details of product 3:");
		p3.insert();
		if(p1.price<p2.price && p1.price<p3.price){
			p1.display();
		}
		else{
			if(p2.price<p3.price){
				p2.display();
			}
			else{
				p3.display();
			}
		}

	}
}

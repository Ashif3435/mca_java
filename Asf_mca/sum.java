import java.util.Scanner;
class sum
{
	int a,b,c;
	void calculate()
	{
		c=a+b;
	}
	void display()
	{
		System.out.println(c);
	}
}
class add
{
	public static void main(String[] args)
	{
		sum ob1=new sum();
		sum ob2=new sum();
		ob1.a=10;
		ob1.b=20;

		ob2.a=30;
		ob2.b=40;
		ob1.calculate();
		ob1.display();
	}

}
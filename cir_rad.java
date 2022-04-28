import java.util.Scanner;
class sum
{
	Scanner s=new Scanner(System.in);
	int r;
	double a,b;
	void insert()
	{
		System.out.println("radious:");
		r=s.nextInt();

	}
	void calculate()
	{
		a=3.14*r*r;
		b=2*3.14*r;
	}
	void display()
	{
		System.out.println("area:"+a);
		System.out.println("perimeter:"+b);
	}
}
class cir_rad
{
	public static void main(String[] args)
	{
		sum ob1=new sum();
		sum ob2=new sum();
		System.out.println("1 circle");
		ob1.insert();
		ob1.calculate();
		ob1.display();
		System.out.println("2 circle");
		ob2.insert();
		ob2.calculate();
		ob2.display();
		System.out.println("largest area:");
		if(ob1.a>ob2.a)
		{
			ob1.display();
		}
		else
		{
			ob2.display();
		}
	}

}
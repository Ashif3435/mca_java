package graphics;
import java.util.Scanner;
public class rect implements ap
{
	int l,b;
	Scanner sc=new Scanner(System.in);
	public void read()
	{
	System.out.println("Enter length and breadth");
	 l=sc.nextInt();
	 b=sc.nextInt();
	}
public void area()
{
int ar=l*b;
System.out.println("Area of Rectangle is "+ar);
}
 public void  perimeter()
{
int pr=2*(l+b);
System.out.println("Perimeter rectangle is "+pr);
}
	
}
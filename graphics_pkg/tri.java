package graphics;
import java.util.Scanner;
public class tri implements ap
{
	int b,h,hypo;
	Scanner sc=new Scanner(System.in);
	public void read()
	{
	System.out.println("Enter base and height");
	 b=sc.nextInt();
	 h=sc.nextInt();
	}
public void area()
{
int ar=(b*h)/2;
System.out.println("Area of triangle is "+ar);
}
 public void  perimeter()
{
	System.out.println("Enter hypotenuse");
	hypo=sc.nextInt();
int pr=b+h+hypo;
System.out.println("Perimeter rectangle is "+pr);
}
	
}
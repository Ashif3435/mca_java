package graphics;
import java.util.Scanner;
public class circle implements ap
{
	Scanner sc=new Scanner(System.in);
	float ra;
	public void read()
	{
	System.out.println("Enter the radius");
	ra=sc.nextFloat();
	}
	public void area()
	{
		float ar=(float)3.14*ra*ra;
		System.out.println("Area of circle is "+ar);
	}
	public void perimeter()
	{
	float pr=(float)3.14*2*ra;
	System.out.println("Perimeter circle is "+pr);
	}
}
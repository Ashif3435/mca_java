package graphics;

import java.util.Scanner;
public class square implements ap
{
	Scanner sc=new Scanner(System.in);
	float si;
	public void read()
	{
	System.out.println("Enter the side");
	si=sc.nextFloat();
	}
	public void area()
	{
		float ar=si*si;
		System.out.println("Area of square is "+ar);
	}
	public void perimeter()
	{
	float pr=4*si;
	System.out.println("Perimeter sqaure is "+pr);
	}
}
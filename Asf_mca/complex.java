import java.util.Scanner;
public class complex{
	int a,b;
	void getitem()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the real part:");
		a=s.nextInt();
		System.out.println("Enter the imaginary part:");
		b=s.nextInt();

	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		complex c1=new complex();
		complex c2=new complex();
		System.out.println("Enter 1st complex number:");
		c1.getitem();
		System.out.println("Enter 2nd complex number:");
		c2.getitem();
		int r1,r2;
		r1=c1.a+c2.a;
		r2=c1.b+c2.b;
		System.out.println("Complex no1:"+c1.a+"+"+c1.b+"i");
		System.out.println("Complex no2:"+c2.a+"+"+c2.b+"i");
		System.out.println("Result:"+r1+"+"+r2+"i");


	}
	
	
}
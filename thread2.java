import java.util.Scanner;

class evenornot implements Runnable
{
	int n;
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter n for even numbers:");
		n=sn.nextInt();
		System.out.println("Even Numbers:");
		for (int i=1;i<=n;i++) {
			if(i%2==0)
			{
				System.out.print(" "+i);
			}
		}
		System.out.println("\n---------------------");
	}
}

class fiba implements Runnable
{
	int n,a=0,b=1,c=0,i=0;
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter n for fibonacci series:");
		n=sn.nextInt();
		System.out.println("Fibonacci series:");
		System.out.print("0 1");
		while(i<n-2)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			i++;
		}
		System.out.println("\n---------------------");
	}

}
class thread2{
	public static void main(String[] args) 
	{
		evenornot or=new evenornot();
		fiba f1=new fiba();
		Thread t1=new Thread(or);
		Thread t2=new Thread(f1);
		t1.start();
		t2.start();
	}
}
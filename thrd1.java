import java.util.Scanner;
class multi extends Thread
{
	int i;
	public void run()
	{
		System.out.println("Multiplication Table of 5:");
		for(i=1;i<=10;i++)
		{
			System.out.println("5x"+i+"="+(i*5));
		}
	}
}
class prime extends Thread
{
	int n,f=0,i=2;
	Scanner sn=new Scanner(System.in);
	public void run()
	{
		System.out.println("Enter n:");
		n=sn.nextInt();
		System.out.println("Prime Numbers:");
		while(i<=n)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f!=1)
			{
				System.out.print(" "+i);
			}
			i++;
			f=0;
		}
	}

}
class thrd1{
	public static void main(String[] args) {
		multi m=new multi();
		prime p=new prime();
		m.start();
		p.start();
	}
}
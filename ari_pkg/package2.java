import arithmetic.addi;
import arithmetic.sub;
import arithmetic.mult;
import arithmetic.div;
import java.util.Scanner;
public class package2{
	public static void main(String args[])
	{
		addi a=new addi();
		sub s=new sub();
		mult m=new mult();
		div d=new div();
		Scanner sc=new Scanner(System.in);
		int op;
		do
		{
			System.out.println("\nEnter your choice: \n\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
			op=sc.nextInt();
			switch(op)
			{
			case 1:a.read();
					a.result();
					break;
			case 2:	s.read();
					s.result();
					break;
			case 3:	m.read();
					m.result();
					break;
			case 4:	d.read();
					d.result();
					break;
			case 5:break;
			
			default: System.out.println("INVALID INPUT");

				}

		}while(op!=5);
	}
}
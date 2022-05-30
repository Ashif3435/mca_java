import graphics.rect;
import graphics.circle;
import graphics.tri;
import graphics.square;
//import graphics.ap;
import java.util.Scanner;
public class package1{
	public static void main(String args[])
	{
		circle c=new circle();
		rect r=new rect();
		tri t=new tri();
		square s=new square();
		Scanner sc=new Scanner(System.in);
		int opt;
		do
		{
			System.out.println("\nEnter your choice\n1.Rectangle\n2.Circle\n3.Triangle\n4.squre\n5.exit\n");
			opt=sc.nextInt();                                                                       
			switch(opt)
			{
			case 1:r.read();
					r.area();
					r.perimeter();
					break;
			case 2:	c.read();
					c.area();
					c.perimeter();
					break;
			case 3:t.read();
					t.area();
					t.perimeter();
					break;
			case 4:s.read();
					s.area();
					s.perimeter();
					break;

			case 5:break;
			default: System.out.println("Invalid Input!!");

				}

		}while(opt!=5);
	}
}


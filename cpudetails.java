import java.util.Scanner;
class cpudetails{
	public static void main(String[] args) {
		cpu c=new cpu();
	}
}
class cpu{
	
	int price;
	cpu(){
		processor p=new processor();
		p.proinput();
		ram r=new ram();
		r.raminput();
		System.out.println("--------------------\nDetails of CPU:");
		p.prodisplay();
		r.ramdisplay();
	}
	class processor{
		Scanner sn=new Scanner(System.in);
		int no_of_core;
		String manufacturer;
		void proinput(){
			System.out.println("ENTER DETAILS OF PROCESSOR:");
			System.out.print("Enter number of Cores:");
			no_of_core=sn.nextInt();
			System.out.print("Enter manufacturer:");
			manufacturer=sn.next();
		}
		void prodisplay(){
			System.out.println("PROCESSOR:");
			System.out.println("Number of Cores:"+no_of_core);
			System.out.println("Manufacturer:"+manufacturer);
		}
	}
	static class ram{
		Scanner sn=new Scanner(System.in);
		int memory;
		String manufacturer;
		void raminput(){
			System.out.println("ENTER DETAILS OF RAM:");
			System.out.print("Enter memory:");
			memory=sn.nextInt();
			System.out.print("Enter manufacturer:");
			manufacturer=sn.next();
		}
		void ramdisplay(){
			System.out.println("RAM:");
			System.out.println("Memory:"+memory);
			System.out.println("Manufacturer:"+manufacturer);
		}
	}
}
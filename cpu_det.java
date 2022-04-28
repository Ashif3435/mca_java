import java.util.Scanner;
class cpu_det{
	public static void main(String[] args) {
		cpu c=new cpu();
	}
}
class cpu{
	
	int price;
	cpu(){
		processor p=new processor();
		p.getpro();
		ram r=new ram();
		r.getram();
		System.out.println("--------------------\ncpu details:");
		p.putpro();
		r.putram();
	}
	class processor{
		Scanner sn=new Scanner(System.in);
		int no_of_core;
		String manufacturer;
		void getpro(){
			System.out.println("Enter Processor details:");
			System.out.print("Enter no_of_Core:");
			no_of_core=sn.nextInt();
			System.out.print("Enter manufacturer:");
			manufacturer=sn.next();
		}
		void putpro(){
			System.out.println("Processor:");
			System.out.println("Number of Cores:"+no_of_core);
			System.out.println("Manufacturer:"+manufacturer);
		}
	}
	static class ram{
		Scanner sn=new Scanner(System.in);
		int memory;
		String manufacturer;
		void getram(){
			System.out.println("Enter Ram details:");
			System.out.print("Enter memory:");
			memory=sn.nextInt();
			System.out.print("Enter manufacturer:");
			manufacturer=sn.next();
		}
		void putram(){
			System.out.println("RAM:");
			System.out.println("Memory:"+memory);
			System.out.println("Manufacturer:"+manufacturer);
		}
	}
}
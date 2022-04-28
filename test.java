import java.util.Scanner;
class test{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int n,s,f=0;
		int a[]=new int[40];
		System.out.println("Enter size of array:");
		n=sn.nextInt();
		System.out.println("Enter the element:");
		for (int i=0;i<n;i++) {
			a[i]=sn.nextInt();
		}
		System.out.println("Array is:");
		for (int i=0;i<n;i++) {
			System.out.println(a[i]); 
		}
		System.out.println("Enter the element to search:");
		s=sn.nextInt();
		for (int i=0;i<n;i++) {
			if (s==a[i]) {
				f=1;
			}
		}
		if (f==0) {
			System.out.println("Element not Found!");
		}
		else{
			System.out.println("Elemen Found!");
		}
	}
}



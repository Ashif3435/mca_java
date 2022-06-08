import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
 class file2{
 	public static void main(String[] args) {
 		try{
 		File f1=new File("list.txt");
 		FileWriter ev=new FileWriter("even.txt");
 		FileWriter od=new FileWriter("odd.txt");
 		Scanner sn=new Scanner(f1);
	 		while(sn.hasNextLine())
	 		{
	 			 int data = sn.nextInt();
	 			 if(data%2==0)
	 			 {
	 			 	ev.write(data1);
	 			 }
	 			 else{
	 			 	od.write(data1);
	 			 
	 			 }
	 			
	 		}
	 			ev.close();
	 			od.close();
		}
 		catch(Exception e){
 			System.out.println(e);
 		}
 		
 	}
 }
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
 class file2{
 	public static void main(String[] args) {
 		try{
 			int data;
 		File f1=new File("list.txt");
 		FileWriter ev=new FileWriter("even.txt");
 		FileWriter od=new FileWriter("odd.txt");
 		Scanner sn=new Scanner(f1);
	 		while(sn.hasNextLine())
	 		{
	 			 data = sn.nextInt();
	 			 if(data%2==0)
	 			 {
	 			 	ev.write(String.valueOf(data));
	 			 }
	 			 else{
	 			 	od.write(String.valueOf(data));
	 			 
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
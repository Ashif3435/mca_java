import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
 class file1{
 	public static void main(String[] args) {
 		try{
  		FileWriter f1=new FileWriter("sample.txt");
 		f1.write("Good Morning");
 		f1.close();
 		File f2=new File("sample.txt");
 		Scanner sn=new Scanner(f2);
	 		while(sn.hasNextLine())
	 		{
	 			 String data = sn.nextLine();
	 			System.out.println(data);
	 		}
		}
 		catch(Exception e){
 			System.out.println(e);
 		}
 		
 	}
 }
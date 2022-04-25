import java.util.Scanner;
public class matrices{
	public static void main (String args[]){
		int  a[][]=new int [5][5];
		int  b[][]=new int [5][5];
		int  c[][]=new int [5][5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns : ");
        int cols = scan.nextInt();
		if (rows!=cols){
			return;
		}
		
		System.out.println("Enter the matrix");
		for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
                a[i][j] = scan.nextInt();
                }
            }
		System.out.println("Enter the matrix");
		for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
               b[i][j] = scan.nextInt();
                }
            }
		System.out.println("The frst:");
                for (int i = 0; i <rows; i++) {
                        for (int j = 0; j <cols; j++) {
                                System.out.print(a[i][j] + "\t");
                        }
                        System.out.println();
                }
		System.out.println("The scnd:");
                for (int i = 0; i <rows; i++) {
                        for (int j = 0; j <cols; j++) {
                                System.out.print(b[i][j] + "\t");
                        }
                        System.out.println();
                }
				

		System.out.println("Addtion");
		for (int i = 0; i <rows; i++) {
            for (int j = 0; j <rows; j++) {
                c[i][j]=a[i][j]+b[i][j];
                }
            }
		for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
                System.out.print(c[i][j] + "\t");
                }
                System.out.println();
            }	
			}
		}
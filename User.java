import java.util.Scanner;
class  invaliduser extends Exception
{
	public invaliduser(String str)
	{
super(str);
	}
} 


class check
{
Scanner sc=new Scanner(System.in);
String usr="mca",pswd="123";
String un,pn;
void get() throws invaliduser
{
System.out.println("Enter the username:");
un=sc.next();
System.out.println("Enter the password:");
pn=sc.next();
if(un.equals(usr) && pn.equals(pswd))
{
System.out.println("Login successfull");
}
else
{
throw new invaliduser("Invalid username or password");
}
}
}

class User
{
public static void main(String args[])
{
check c=new check();
try
{
c.get();
}
catch(invaliduser u)
{
System.out.println("Exception occured\n");	
}
}
}
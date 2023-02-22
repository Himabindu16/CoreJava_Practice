import java.util.Scanner;

class Alpha
{
	public void division()
	{
		try 
		{
			System.out.println("Welcome to division performing application");		
			Scanner s = new Scanner(System.in);		
			System.out.println("Enter the first number to divide");
			int a = s.nextInt();
			System.out.println("Enter the second number to divide");
			int b = s.nextInt();		
			int res = a/b;
			System.out.println("The result is "+res);
		}catch(ArithmeticException e) {
			System.out.println("Enter the non zero second number");
		}
		
		System.out.println("Thank you for using our application");
	}
}

class Beta
{
	public void disp()
	{
		Alpha a = new Alpha();
		a.division();
	}	
}

public class Exceptions6 {

	public static void main(String[] args) 
	{	
		Beta b = new Beta();
		b.disp();	
	}

}

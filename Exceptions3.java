import java.util.Scanner;

public class Exceptions3 
{

	public static void main(String[] args) 
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
		}
		catch(Exception e)
		{
			System.out.println("Thank you for using our application");
	
		}
		
	}
}

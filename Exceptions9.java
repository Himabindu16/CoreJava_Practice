import java.util.Scanner;

class Alpha2
{
	public void division()throws ArithmeticException
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
		catch (ArithmeticException e) 
		{
			System.out.println("Exception handled in division method only");
			throw e;
		}
		
		System.out.println("Thank you for using our application");
	}
}

public class Exceptions9 {

	public static void main(String[] args) {
		
		System.out.println("Main method connection established");
		try 
		{
			Alpha2 a = new Alpha2();
			a.division();
		}
		catch (Exception e) 
		{
			System.out.println("Exception handled in main");
		}

	}

}

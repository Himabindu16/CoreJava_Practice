import java.util.Scanner;

class Alpha1
{
	public void division()throws ArithmeticException
	{
		
		System.out.println("Welcome to division performing application");		
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter the first number to divide");
		int a = s.nextInt();
		System.out.println("Enter the second number to divide");
		int b = s.nextInt();		
		int res = a/b;
		System.out.println("The result is "+res);
		
		System.out.println("Thank you for using our application");
	}
}

class Beta1
{
	public void disp()
	{
		Alpha1 a = new Alpha1();
		a.division();
	}	
}

public class Exceptions7 {

	public static void main(String[] args) 
	{
		try 
		{
			Beta1 b = new Beta1();
			b.disp();	
		}
		catch(ArithmeticException e) 
		{
			//System.out.println("Enter the non zero second number");
			System.out.println("Handling in main method");
		}

	}

}

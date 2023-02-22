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
		try 
		{
		Alpha1 a = new Alpha1();
		a.division();
		}
		catch(Exception e) 
		{
			System.out.println("Handled in caller disp()");
		}
	}	
}

public class Exceptions8 {

	public static void main(String[] args) {
		Beta1 b = new Beta1();
		b.disp();			
	}

}

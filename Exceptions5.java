import java.util.Scanner;

public class Exceptions5 {

	public static void main(String[] args) {
		
			System.out.println("Welcome to Kadali's application");		
			Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter the first number to divide");
			int a = s.nextInt();
			System.out.println("Enter the second number to divide");
			int b = s.nextInt();		
			int res = a/b;
			System.out.println("The result is "+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Oye bruh? Please enter non zero second number");
		}
				
		try 
		{
			System.out.println("Please enter the size of an array");
			int size = s.nextInt();
			int ar[]= new int[size];
		
			System.out.println("Enter the element to be added in array");
			int elem = s.nextInt();

			System.out.println("Enter the position at which element has to be inserted");
			int pos = s.nextInt();
			ar[pos] = elem;
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Ohho Am I joke? Please be positive");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Man be in your limits");
		}
		
		catch(Exception e)	//java.util.InputMismatchException
		{
			System.out.println("Please enter proper input");
		}
		System.out.println("Thank you for using our application");

	}

}

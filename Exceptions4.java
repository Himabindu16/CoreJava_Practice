import java.util.Scanner;

public class Exceptions4 
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
		
			System.out.println("Please enter the size of an array");
			int size = s.nextInt();
			int ar[]= new int[size];
			System.out.println("Enter the element to be added in array");
			int elem = s.nextInt();
			System.out.println("Enter the position at which element has to be inserted");
			int pos = s.nextInt();
			ar[pos] = elem;
		}
		catch(Exception e)
		{
			System.out.println("Give proper input Are u fool! Are u mad?");
		}
		
		System.out.println("Thank you for using our application");
	}

}

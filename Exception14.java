
import java.util.Scanner;

class InvalidUserException extends Exception
{
	 InvalidUserException(String msg)
	 {
		 super(msg);
	 }
}

class ATM1
{
	private int accountNum=1111;
	private int password=2222;
	private int accN;
	private int pw;
	
	public void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the account Number");
		accN = s.nextInt();
		System.out.println("Enter the password");
		pw = s.nextInt();
	}
	
	public void verify() throws InvalidUserException
	{
		if(accountNum == accN && password == pw)
		{
			System.out.println("Collect your cash");
		}
		else
		{
//			InvalidUserException iue = new InvalidUserException();
//			System.out.println("Invalid credentials");
//			throw iue;
		
			throw new InvalidUserException("Invalid credentials!");
		}
	}	
}

class Bank
{
	public void initiate()
	{
		ATM1 a = new ATM1();
		try
		{
			
			a.input();
			a.verify();
		}
		catch(InvalidUserException e)
		{
			try
			{
				System.out.println(e.getMessage());
				a.input();
				a.verify();
			}
			catch(InvalidUserException f)
			{
				try
				{
					System.out.println(e.getMessage());
					a.input();
					a.verify();
				}
				catch (InvalidUserException g) 
				{
					System.out.println(e.getMessage());
					System.out.println("Card is blocked TATA BYE BYE");
					System.exit(0);
				}
			}
		}
	}
}

public class Exception14 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();
	}

}

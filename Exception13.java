import java.util.Scanner;

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
	
	public void verify()
	{
		if(accountNum == accN && password == pw)
		{
			System.out.println("Collect your cash");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	}
	
}

class Bank
{
	public void initiate()
	{
		ATM1 a = new ATM1();
		a.input();
		a.verify();
	}
}

public class Exception13 {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.initiate();
	}

}

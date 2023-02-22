
class Beta
{
	void disp()
	{
		try 
		{
			System.out.println("Disp method");
			System.exit(0);
		}
		finally
		{
			System.out.println("finally");
		}
	}
}

public class Exception12 
{

	public static void main(String[] args) 
	{
		Beta b = new Beta();
		b.disp();
	}

}

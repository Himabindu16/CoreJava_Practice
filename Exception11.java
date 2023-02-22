
class Demo
{
	int disp()
	{
		try 
		{
			System.out.println("Disp");
			return 10;
		}
		finally
		{
			System.out.println("Disp last line");
		}
	}
}
public class Exception11 
{

	public static void main(String[] args) 
	{
		Demo d = new Demo();
		System.out.println(d.disp());
	}

}

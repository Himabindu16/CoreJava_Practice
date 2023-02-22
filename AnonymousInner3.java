
interface CLS
{
	int getLength(String s);
	void disp();
}

public class AnonymousInner3 
{

	public static void main(String[] args) 
	{
		CLS c = new CLS()
		{
			public int getLength(String s)
			{
				int res = s.length();
				return res;
			}
			
			public void disp()
			{
				System.out.println("Disp method");
			}
		};
		System.out.println(c.getLength("Alien"));
		c.disp();
	}

}

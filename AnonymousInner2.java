@FunctionalInterface
interface CLS
{
	int getLength(String s);
}
public class AnonymousInner2 {

	public static void main(String[] args) {
		
		CLS c = new CLS()
		{
			public int getLength(String s)
			{
				int res = s.length();
				return res;
			}
		};
		
		c.getLength("Hello");
		System.out.println(c.getLength("Hello"));
	}

}

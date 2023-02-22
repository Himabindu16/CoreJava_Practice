
interface Alpha 
{
	void beta();
}

public class AnonymousInner1 {

	public static void main(String[] args) {
		
		Alpha a = new Alpha()
		{
			public void beta()
			{
				System.out.println("Anonymous implementation");
			}
		};
		a.beta();
	}

}

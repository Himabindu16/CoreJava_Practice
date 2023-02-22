
class Computer
{
	public void config()
	{
		System.out.println("i7, 16gb, 1TB");
	}
}

//class Laptop extends Computer
//{
//	public void config()
//	{
//		System.out.println("i9, 32gb, 1TB");
//	}
//}

public class AnonymousInner4 {

	public static void main(String[] args) {
		
		Computer com = new Computer() 
		{
			public void config()
			{
				System.out.println("i9, 32gb, 1TB");
			}
		};
		com.config();

	}

}

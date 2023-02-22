
class Demo
{
	public void disp()
	{
		disp();
	}
}
public class Exceptions1 {

	public static void main(String[] args) 
	{
		Demo d = new Demo();
		System.out.println("Object creation is fine now going to call method");
		d.disp();
	}

}

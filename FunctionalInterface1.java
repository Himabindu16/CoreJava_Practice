
interface Demo
{
	void disp();
}

class Demo1 implements Demo
{
	public void disp()
	{
		System.out.println("Interface method implementation");
	}
}

public class FunctionalInterface1 {

	public static void main(String[] args) {
		
		Demo d = new Demo1();
		d.disp();
	}

}

@FunctionalInterface
interface Demo
{
	void disp();
	//void disp1(); //- Only 1 abstract method in FunctionalInterface
}

class Alpha implements Demo
{
	public void disp()
	{
		System.out.println("Interface implementation");
	}
}

public abstract class FunctionalInterface2 {

	public static void main(String[] args) {
		
		Demo d = new Alpha();
		d.disp();
	}

}

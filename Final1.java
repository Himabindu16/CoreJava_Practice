
//final class Demo1 - error
class Demo1
{
	final int a = 10;
	final public void disp1()
	{
		System.out.println("Parent disp1 method");
	}
	//int a=20; - error -can't be changed with final acts as constant
}

final class Demo2 extends Demo1
{
	public void disp2() //inherits but cannot override
	{
		System.out.println("Child disp2 method");
	}
}

public class Final1 {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		d1.disp1();
		d2.disp2();
	}

}

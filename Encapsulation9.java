
class Alien5
{
	private int age;
	private String name;
	
	public Alien5()
	{
		this(10, "Telusko");
	}
	

	public Alien5(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	

	public Alien5(int age)
	{
		this();
		this.age=age;		
	}


	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	
}

public class Encapsulation9 {

	public static void main(String[] args) {
		
		Alien5 a4 = new Alien5();
		System.out.println(a4.getAge());
		System.out.println(a4.getName());
		
		Alien5 a5 = new Alien5(20);
		System.out.println(a5.getAge());
		System.out.println(a5.getName());
	}

}


class Alien3
{
	private int age;
	private String name;
	
	Alien3(int age, String name)
	{
		this.name=name;
		this.age=age;
	}
	
	Alien3()
	{
		super();
		name="Hima";
		age=22;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public String getName() 
	{
		return name;
	}	
	
}                   
  
public class Encapsulation8 {

	public static void main(String[] args) {
		
		Alien3 a3=new Alien3(21, "Kadali");
		System.out.println(a3.getAge());
		System.out.println(a3.getName());
		
		Alien3 a4=new Alien3();
		System.out.println(a4.getAge());
		System.out.println(a4.getName());
	}

}

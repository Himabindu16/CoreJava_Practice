
class Alien
{
	private int age;
	private String name;
	
	public void setAge(int x)
	{
		if(x>0)
		{
			age=x;
		}
		else
		{
			System.out.println("Invalid age, age can't be negative");
		}
	}
	public void setName(String y)
	{
		name=y;
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

public class Encapsulation2 {

	public static void main(String[] args) 
	{
		Alien a=new Alien();
		a.setAge(10);
		a.setName("Sam");
		System.out.println(a.getAge());
		System.out.println(a.getName());
	}

}

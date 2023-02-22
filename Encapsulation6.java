
class Alien2
{
	private int age;
	private String name;
	
	Alien2(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public String getName() {
		return name;
	}

	
}

public class Encapsulation6 {

	public static void main(String[] args) {
		
		Alien2 a2= new Alien2(22,"Ramya");
		System.out.println(a2.getAge());
		System.out.println(a2.getName());
	}

}

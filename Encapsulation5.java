
class Alien1
{
	private int age;
	private String name;
	
	Alien1(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	
}


public class Encapsulation5 {

	public static void main(String[] args) {
		
		Alien1 a=new Alien1(22,"Telusko");
//		a.setAge(22);
//		a.setName("Amma");
		System.out.println(a.getAge());
		System.out.println(a.getName());
	}

}

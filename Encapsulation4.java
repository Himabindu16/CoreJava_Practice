
class Student
{
	private String name;
	private int roll;
	private String section;
	
	public void setName(String name)
	{
		this.name=name;
	}
	 
	public void setRoll(int roll)
	{
		roll=roll;
	}
	
	public void setSection(String section)
	{
		section=section;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRoll()
	{
		return roll;
	}
	
	public String getSection()
	{
		return section;
	}
}


public class Encapsulation4 {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Hima");
		s.setRoll(37);
		s.setSection("A");
		
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		System.out.println(s.getSection());
	}

}

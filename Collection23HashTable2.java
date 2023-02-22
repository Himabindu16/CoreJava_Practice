
class Student
{
	int rollNo;
	
	Student(int rollNo)
	{
		this.rollNo= rollNo;
	}
	
	public int hashCode()
	{
		return rollNo;
	}
}

public class Collection23HashTable2 {

	public static void main(String[] args) {
		
		Student s1 = new Student(10);
		Student s2 = new Student(100);
		System.out.println(s1);
		System.out.println(s2);
	}

}

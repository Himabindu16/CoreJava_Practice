//Using Comparator


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
	int age;
	String name;
	String tech;
	Integer i;
	
	public Student(int age, String name, String tech) {
		super();
		this.age = age;
		this.name = name;
		this.tech = tech;
	}


	@Override//if we want to print object itself instead of printing hash code to print values
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}	
	
//	@Override
//	public int compareTo(Student that)
//	{	
//		return this.tech.length() - that.tech.length();//technology string size small to big		
//	}
	
}


class ComparatorImpl implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.age - s2.age;
	}
}


public class ComparableComparator2 {

	public static void main(String[] args) {
			
	       ArrayList<Student> nums = new ArrayList<>();
	       nums.add(new Student(21 , "Nagesh", "Java"));
	       nums.add(new Student(17 , "Ashwini", "JS"));
	       nums.add(new Student(18 , "Souvik", "Blockchain"));

	       Comparator<Student> com = new ComparatorImpl();
	       
	       Collections.sort(nums, com);
	       //21 17 18
	       //17 21 18
	       //17 18 21

	       System.out.println(nums);

	}

}

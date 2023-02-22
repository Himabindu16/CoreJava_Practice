//Using Comparator

import java.util.ArrayList;
import java.util.Collections;

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
	
}

public class ComparableComparator3 {

	public static void main(String[] args) {
		
		ArrayList<Student> nums = new ArrayList<>();
		nums.add(new Student(21 , "Nagesh", "Java"));
		nums.add(new Student(17 , "Ashwini", "JS"));
		nums.add(new Student(18 , "Souvik", "Blockchain"));

		//Comparator<Student> com = (s1, s2) ->  s1.age - s2.age;		
		//Collections.sort(nums, (s1, s2) ->  s1.age - s2.age);
		Collections.sort(nums, (s1, s2) ->  s1.tech.length() - s2.tech.length());
	       //21 17 18
	       //17 21 18
	       //17 18 21
		
		System.out.println(nums);
	}

}

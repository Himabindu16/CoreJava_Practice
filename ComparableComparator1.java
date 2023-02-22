//Using Comparable - When we have source code for student

import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student>
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
	
	@Override
	public int compareTo(Student that)
	{
		//return this.age - that.age;// positive number swap negative number don't swap
		//return that.age - this.age; // descending order
		//return this.name.compareTo(that.name);
		return this.tech.length() - that.tech.length();//technology string size small to big
		//return that.tech.length() - this.tech.length();
		
	}
	
}

public class ComparableComparator1 {
	
	public static void main(String[] args) {
		
	       ArrayList<Student> nums = new ArrayList<>();

	       //Student s1 = new Student(age:21 , name:"Nagesh", tech:"Java");
//	       Student s1 = new Student(21 , "Nagesh", "Java");
//	       nums.add(s1);
			
	       nums.add(new Student(21 , "Nagesh", "Java"));
	       nums.add(new Student(17 , "Ashwini", "JS"));
	       nums.add(new Student(18 , "Souvik", "Blockchain"));

	       //nums.sort(null);
	       Collections.sort(nums);
	       //21 17 18
	       //17 21 18
	       //17 18 21

	       System.out.println(nums);

	}
}

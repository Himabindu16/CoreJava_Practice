import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int []a = new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Please enter the marks of Student "+ i);
			a[i]=s.nextInt();
		}
		
		System.out.println("The marks of Students are as follows");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");	
		}
		
		
	}

}

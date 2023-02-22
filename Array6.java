import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		
		int []a = new int[4];
		
		Scanner s = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[2]+" ");
		}
		
	}

}

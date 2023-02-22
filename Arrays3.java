import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		int [][]arr = new int[3][4];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) //0<0.length
			{
				System.out.println("Enter the marks of class "+i + "Student "+j);
				 arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();
		}
	}

}

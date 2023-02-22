import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {

		int arr[][][] = new int[3][2][3];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter marks of School "+ i + "Classes is "+ j +"Student "+ k);
					arr[i][j][k]=s.nextInt();
				}
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
					
				}
				System.out.println();
			}
		}
		
		
	}

}

import java.util.Scanner;

public class Arrays9 {

	public static void main(String[] args) 
	{
		
			int a[][][] = new int[2][][];
			a[0] = new int[2][];
			a[1] = new int[3][];
			a[0][0] = new int[2];
			a[0][1] = new int[3];
			a[1][0] = new int[3];
			a[1][1] = new int[2];
			a[1][2] = new int[4];
			
			
			Scanner s = new Scanner(System.in);
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					for(int k=0;k<a[i][j].length;k++)
					{
						System.out.println("Enter marks of School "+ i + "Classes is "+ j +"Student "+ k);
						a[i][j][k]=s.nextInt();
						
					}
				}
			}

			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					for(int k=0;k<a[i][j].length;k++)
					{
						System.out.print(a[i][j][k]+" ");
						
					}
					System.out.println();
				}
			}
			
		
			
	}

}

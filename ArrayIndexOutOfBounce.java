
public class ArrayIndexOutOfBounce {

	public static void main(String[] args) {

		int a[] = new int[3];
		
		for(int i=0;i<5;i++) 
		{
			System.out.println(a[i]);//Runtime-error, Unchecked exception
		}
	}

}

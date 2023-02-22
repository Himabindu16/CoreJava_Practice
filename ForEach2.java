
public class ForEach2 {

	public static void main(String[] args) {
		
		//2D  for each loop
		int arr[][] = {{10, 20, 30, 40},{10, 20, 30}};
		for(int ar[]:arr)
		{
			for(int element:ar) 
			{
				System.out.println(element);
			}
		}

	}

}

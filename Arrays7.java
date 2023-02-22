
class Fan {
	
	String brand;
	int cost;
	
}
public class Arrays7 
{

	public static void main(String[] args) 
	{

		Fan []f = new Fan[3];
		f[0] = new Fan();//HeapArea
		f[1] = new Fan();
		f[2] = new Fan();
		
		f[0].brand="Bajaj";
		f[1].brand="Usha";
		f[2].brand="Vidya";
		
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		
	}

}

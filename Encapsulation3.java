
class Fan
{
	private int cost;
	private String brand;
	
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public int getCost()
	{
		return cost;
	}
	
	public String getBrand()
	{
		return brand;
	}
}


public class Encapsulation3 {

	public static void main(String[] args) {
		
		Fan f= new Fan();
		f.setCost(1000);
		f.setBrand("Usha");
		System.out.println(f.getCost());
		System.out.println(f.getBrand()
				
				
									);
	}

}

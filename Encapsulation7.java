
class Car
{
	int num;
	String brand;
	
	Car(int num,String brand)
	{
		this.num=num;
		this.brand=brand;
	}
	
	public int getNum() {
		return num;
	}
	public String getBrand() {
		return brand;
	}
	
	
}
public class Encapsulation7 {

	public static void main(String[] args) {
		
		Car c = new Car(12, "BMW");
		System.out.println(c.getBrand());
		System.out.println(c.getNum());
		
	}

}

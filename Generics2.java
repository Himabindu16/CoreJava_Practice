import java.util.*;

class Gen<T>
{
	T obj;
	
	Gen(T obj)
	{
		this.obj = obj;
	}
	
	public void show()
	{
		System.out.println("The type of object is :: "+obj.getClass().getName());
	}
	
	public T getObj()
	{
		return obj;
	}
}

public class Generics2 {

	public static void main(String[] args) {
		
		Gen<Integer> g1 = new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObj());
		
		Gen<String> g2 = new Gen<String>("sachin");
		g2.show();
		System.out.println(g2.getObj());
		
		Gen<Double> g3 = new Gen<Double>(10.7);
		g3.show();
		System.out.println(g3.getObj());

		Gen<Character> g4 = new Gen<Character>('A');
		g4.show();
		System.out.println(g4.getObj());

	}

}

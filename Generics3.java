import java.util.*;

class Demo<T extends Number>
{
	
}

class Trails<T extends Runnable>//valid
{
	
}

class Trial<T implements Runnable>//invalid
{
	
}

class Sample<T implements X> //invalid
{
	
}

class Twist<T super X>//invalid
{
	
}

public class Generics3 {

	public static void main(String[] args) {
		Demo<String> d1 = new Demo<String>();//invalid
		
		Demo<Integer> d1 = new Demo<Integer>();//valid
		Demo<Double> d1 = new Demo<Double>();//valid
		Demo<Number> d1 = new Demo<Number>();//valid
		
		Trial<Runnable> t1 = new Trial<Runnable>();//valid
		Trial<Thread> t1 = new Trial<Thread>();//valid
		Trial<String> t1 = new Trial<String>();//invalid
	}

}
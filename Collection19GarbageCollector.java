import java.util.*;
public class Collection19GarbageCollector {

	public static void main(String[] args) throws InterruptedException {

		Employee e = new Employee();
		;;;;;;;;;
		;;;;;;;;;
		;;;;;;;;;
		
		e = null;//Garbage object
		System.gc();//Informing JVM to active GC thread to lean garbage object
		Thread.sleep(5000);
		
	}

}

class Employee
{
	@Override
	public void finalize()
	{
		System.out.println("Cleaning the object");
	}
}
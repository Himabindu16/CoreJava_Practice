import java.util.HashMap;
import java.util.WeakHashMap;

public class Collection21WeakHashMapGC8 {

	public static void main(String[] args) throws InterruptedException {

		WeakHashMap hm = new WeakHashMap();
		Temp t = new Temp();
		hm.put(t, "shri");
		System.out.println(hm);//{temp, shri}
		
		t=null;
		System.gc();//Triggering garbage collector thread to clean 't'
		Thread.sleep(3000);
		
		System.out.println(hm);
	}

}

class Temp
{
	public String toString()
	{
		return "temp";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Cleaning the object");
	}
}
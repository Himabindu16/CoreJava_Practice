import java.util.HashMap;

public class Collection20HashMapGC7 {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap hm = new HashMap();
		Temp t = new Temp();
		hm.put(t, "shri");
		System.out.println(hm);//{temp, shri}
		
		t=null;
		System.gc();//Triggering garbage collector thread to clean 't'
		Thread.sleep(5000);
		
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
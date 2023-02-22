import java.util.HashMap;
import java.util.IdentityHashMap;


public class Collection18IdentityHashMap5 {

	public static void main(String[] args) {
		
		IdentityHashMap hm = new IdentityHashMap();
		
		//Creating a key
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		//Adding the data to HashMap
		hm.put(i1, "sachin");
		hm.put(i2, "messi");
		System.out.println(hm);


	}

}

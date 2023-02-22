import java.util.HashMap;

public class Collection15HashMap2 {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		//hm.put(0, 0);
		hm.put(null, 0);//null -> 0 
		hm.put(null, null);//null -> null
		hm.put(null, "ABC");//null -> ABC
		
		System.out.println(hm);
		
		
	}

}

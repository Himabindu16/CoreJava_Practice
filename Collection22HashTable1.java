import java.util.Hashtable;

public class Collection22HashTable1 {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		ht.put(10, "sachin");
		ht.put(7, "dhoni");
		ht.put("ABC", null);//NullPointerException
		System.out.println(ht);
//		 Properties p = new Properties();
		 

	} 

}

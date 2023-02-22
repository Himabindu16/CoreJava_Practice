import java.util.*;

public class Collection16LinkedHashMap3 {

	public static void main(String[] args) {
		

		LinkedHashMap hm1 = new LinkedHashMap();
		hm1.put(10, "sachin");
		hm1.put(7, "dhoni");
		hm1.put(18, "kohli");
		hm1.put(45, "dravid");
		System.out.println(hm1);//hm1.toString() will be called
		System.out.println("*******************************");	
		
		Set s = hm1.keySet();//To get the keys from Map
		System.out.println(s);		
		System.out.println(s.getClass().getName());
		System.out.println("*******************************");
		Collection c = hm1.values();//To get the values from Map
		System.out.println(c);
		System.out.println(c.getClass().getName());
		System.out.println("*******************************");
		Set mapData = hm1.entrySet();//To get the K,V from Map as Set
		System.out.println(mapData);
		System.out.println(mapData.getClass().getName());
		System.out.println("*******************************");
		System.out.println();
		Iterator itr = mapData.iterator();
		while(itr.hasNext())
		{
			Map.Entry data = (Map.Entry)itr.next();
			System.out.println(data.getKey()+": "+data.getValue());
			if(data.getKey().equals(10))
			{
				data.setValue("SRT");
			}
			//hm1.put(9, "lara");
		}
		System.out.println();
		System.out.println(hm1);

	}

}

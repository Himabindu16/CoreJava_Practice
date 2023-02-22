import java.util.Iterator;
import java.util.LinkedList;

public class Collection8Iterator2 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add("iNeuron");
		ll.add("Bengaluru");
		System.out.println(ll);
		
		Iterator itr1 = ll.iterator();
//		while(itr1.hasNext())
//		{
//			System.out.println(itr1.next());
//		}
		
		while(itr1.hasNext())
		{
			//System.out.println();
			LinkedList o = (LinkedList)itr1.next();
			
		}
		
		
	}

}

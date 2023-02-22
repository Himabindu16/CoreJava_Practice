import java.util.LinkedList;
import java.util.ListIterator;

public class Collection9Iterator3 {

	public static void main(String[] args) {
			
		LinkedList ll2 = new LinkedList();
		ll2.add(10);
		ll2.add(20);
		ll2.add("iNeuron");
		ll2.add("Bengaluru");
		System.out.println(ll2);
		
//		ListIterator litr1 = ll2.listIterator();
//		while(litr1.hasNext())
//		{
//			System.out.println(litr1.next());
//		}
		
		ListIterator litr1 = ll2.listIterator(ll2.size());
		while(litr1.hasPrevious())
		{
			System.out.println(litr1.previous());
		}
	}

}

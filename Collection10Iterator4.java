import java.util.Iterator;
import java.util.LinkedList;

public class Collection10Iterator4 {

	public static void main(String[] args) {
		
		LinkedList ll3 = new LinkedList();
		ll3.add(10);
		ll3.add(20);
		ll3.add("iNeuron");
		ll3.add("Bengaluru");
		System.out.println(ll3);
		
		Iterator ditr = ll3.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
	}

}

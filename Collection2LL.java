import java.util.LinkedList;

public class Collection2LL {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(2);
		ll.add(3);
		ll.add("Hi");
		ll.add(2, 90);
		ll.add(15);
		ll.add(20);
		System.out.println(ll);
		
		ll.addFirst(123);		
		System.out.println(ll.get(0));
		
		ll.add(10);
		System.out.println(ll);
		
		ll.addLast(31);
		System.out.println(ll);
		
		//ll.clear();		
		System.out.println(ll.isEmpty());
		System.out.println(ll.getClass());
		System.out.println(ll.size());
		System.out.println(ll.contains(3));
		System.out.println(ll.indexOf(20));
		System.out.println(ll.hashCode());
		
		LinkedList ll1 = new LinkedList();
		ll1.add(null);
		System.out.println(ll1);
		
	}

}
 
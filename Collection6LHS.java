import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection6LHS {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(50);
		lhs.add(25);
		lhs.add(15);
		lhs.add("Hello");
		
		System.out.println(lhs);

		System.out.println(lhs.contains(50));
		System.out.println(lhs.remove(20));
		System.out.println(lhs);
		System.out.println(lhs.hashCode());
		System.out.println(lhs.size());
		System.out.println(lhs.getClass());
		System.out.println(lhs.isEmpty());
		lhs.add(15);
		System.out.println(lhs);
	}

}

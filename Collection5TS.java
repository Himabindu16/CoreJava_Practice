import java.util.TreeSet;

public class Collection5TS {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(15);
		ts.add(30);
		ts.add(50);
		ts.add(10);
		ts.add(20);
		
		ts.add(100);
		ts.add(75);
		System.out.println(ts);
		
		System.out.println(ts.higher(15));
		System.out.println(ts.ceiling(15));
		
		System.out.println(ts.lower(20));
		System.out.println(ts.floor(20));
		
		ts.add(null);
		System.out.println(ts);
	}

}

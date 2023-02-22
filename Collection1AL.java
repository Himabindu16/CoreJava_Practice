import java.util.ArrayList;

public class Collection1AL {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
//		al.add(100);
//		al.add(10);
//		al.add(200);
//		al.add(300);
//		System.out.println(al);

		al.add(10);
		al.add("Hii");
		al.add(300);
		al.add("Hello");
		al.add(500);
		System.out.println(al);
		
		al.add(1, 5);
		System.out.println(al);
		
		System.out.println("========================");
//		al.clear();
		
		
		System.out.println(al.contains(10));		
		System.out.println(al.getClass());
		
		System.out.println(al.equals(100));
		System.out.println(al.indexOf(300));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		System.out.println("========================");
		
		al.add(300);
		
		ArrayList al1 = new ArrayList();
		al1.add(6);
		al1.add(3);
		System.out.println(al1);
		
		al1.add(null);
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);
	}

}

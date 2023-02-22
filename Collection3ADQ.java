import java.util.ArrayDeque;

public class Collection3ADQ {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(100);
		ad.add(25);
		ad.add(50);
		ad.add(120);
		ad.add("iNeuron");
		System.out.println(ad);
		ad.addFirst(12);
		System.out.println(ad);
		
		ad.addLast(20);
		System.out.println(ad);
		
		ArrayDeque ad1 = new ArrayDeque();
		ad1.add(null);
		System.out.println(ad1);
	}

}

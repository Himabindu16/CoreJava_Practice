import java.util.PriorityQueue;

public class Collection4PQ {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(15);
		pq.add(30);
		pq.add(50);
		pq.add(10);
		pq.add(20);
		
		pq.add(100);
		pq.add(75);
		//pq.add(30);
		System.out.println(pq);
		
		pq.contains(20);
		System.out.println(pq);
		
		pq.add(null);
		System.out.println(pq);
	}

}

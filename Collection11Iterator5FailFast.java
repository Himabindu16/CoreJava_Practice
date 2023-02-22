import java.util.ArrayList;
import java.util.Iterator;

public class Collection11Iterator5FailFast {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(25);
		al.add(40);
		al.add(15);
		System.out.println(al);
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//			
//		}
	
		Iterator itr5 = al.iterator();
		while(itr5.hasNext())
		{
			System.out.println(itr5.next());
			al.add(99);
		}
	}

}

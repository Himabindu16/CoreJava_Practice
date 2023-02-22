import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collection12Iterator6FailSafe {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		cal.add(100);
		cal.add(200);
		cal.add(300);
		System.out.println(cal);
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//			
//		}
	
		Iterator itr6 = cal.iterator();
		while(itr6.hasNext())
		{
			System.out.println(itr6.next());
			cal.add(990);
		}

	}

}

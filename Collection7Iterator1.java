import java.util.ArrayList;
import java.util.List;

public class Collection7Iterator1 {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
//		System.out.println(l.size());
//		for(int i=0;i<=l.size()-1;i++)
//		{
//			System.out.println(l.get(i));
//		}
	
		for(Object o:l)
		{
			System.out.println(o);
		}
	
	}

}

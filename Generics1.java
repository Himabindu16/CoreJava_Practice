import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();//valid-JDK 1.5V
//		ArrayList<Integer> a = new ArrayList<Integer>();//valid-JDK 1.5V
//
//		List<String> al = new ArrayList<String>();//valid
//		Collection<String> al = new ArrayList<String>();//valid
//		
//		List<Object> al = new ArrayList<String>();//invalid-CE:incompatible types
//		ArrayList<int> al = new ArrayList<int>();//invalid-CE:unexpected type found: primitive required: refeerence
		
				
		al.add("sachin");
		al.add("tendulkar");
		//al.add(10); 
		
		String firstName = al.get(0);
		String lastName = al.get(1);
		System.out.println(firstName+""+lastName);
	}

}

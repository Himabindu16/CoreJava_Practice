import java.util.Enumeration;
import java.util.Vector;

public class Collection13EnumerationVector {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(25);
		v.add(40);
		v.add(50);
		System.out.println(v);

		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}

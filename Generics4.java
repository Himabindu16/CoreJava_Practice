import java.util.*;

class HashMap<K,V>
{
	
}

public class Generics4 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> h = new HashMap<Integer, String>();

		ArrayList<String>l1 = new ArrayList<String>();//valid
		ArrayList<?>l2 = new ArrayList<String>();//valid
		ArrayList<?>l3 = new ArrayList<Integer>();//valid
		ArrayList<? extends Number>l4 = new ArrayList<Integer>();//valid
		ArrayList<? extends Number>l5 = new ArrayList<String>();//invalid
		ArrayList<?>l6 = new ArrayList<? extends Number>();//invalid
		ArrayList<?>l7 = new ArrayList<?>();//invalid
		
		
		public<T> void methodOne1(T t){}//valid
		public<T extends Number>void methodOne2(T t){}//valid
		public<T extends Number&Comparable>void methodOne3(T t){}//valid
		public<T extends Number&Comparable&Runnable>void methodOne4(T t){}//valid
		public<T extends Number&Thread>void methodOne5(T t){}//invalid(2 classes)
		public<T extends Runnable&Number>void methodOne6(T t){}//invalid(1st interface not possible)
		public<T extends Number&Runnable>void methodOne7(T t){}//valid
	}

}

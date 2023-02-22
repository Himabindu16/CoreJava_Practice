
public class PostPreIncrementationDecrementation {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		System.out.println(a);
		System.out.println(b);
		b=a++ + ++a + a-- + --a + a++;
  		System.out.println(b);

	}

}

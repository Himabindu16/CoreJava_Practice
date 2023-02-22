
public class PostPreIncrementation {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		//a = ++a; 6
		//a=a++;  5 assignment more priority than increament in this case and assigning element should be different
		b=a++ + a++ + ++a + ++a;
		System.out.println(a);
		System.out.println(b);
	}
}

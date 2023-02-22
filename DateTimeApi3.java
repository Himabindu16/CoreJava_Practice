import java.time.LocalDateTime;

public class DateTimeApi3 {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		System.out.println();
		
		LocalDateTime dt1 = LocalDateTime.of(1995, 1, 3, 12, 45);//immutable
		System.out.println(dt1);
		
		System.out.println("After six months:"+dt1.plusMonths(6));// 1995/7/3
		System.out.println("Before six months:"+dt1.minusMonths(6));// 1994/7/3
		//System.out.println(dt1.minusYears(1));
		
		System.out.println();
		
		//System.out.println(dt1.plusYears(1));
		System.out.println(dt1);
	}

}
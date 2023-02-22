import java.time.LocalDate;
import java.time.Period;

public class DateTimeApi5 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();//current date 
		System.out.println(today);
		
		LocalDate birthday = LocalDate.of(2000, 03, 16);
		System.out.println(birthday);
		
		Period p = Period.between(birthday, today);
		System.out.println(Period.between(today, birthday));//P-22Y-11M-6D
		System.out.printf("age is %d years %d months %d days", p.getYears(),p.getMonths(),p.getDays());
	
		System.out.println();
		
		LocalDate birthday2 = LocalDate.of(2002, 11, 20);
		
		Period p2 = Period.between(birthday2, today);
		System.out.printf("age is %d years %d months %d days", p2.getYears(),p2.getMonths(),p2.getDays());
		
		
	
	}

}

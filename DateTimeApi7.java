import java.time.Year;

public class DateTimeApi7 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		Year y = Year.now();
		

		if(y.isLeap())
			System.out.printf("%d is leap year");
		else
			System.out.printf("%d is not leap year");
	}

}

import java.time.Year;

public class DateTimeApi6 {

	public static void main(String[] args) {
		
		Integer data =Integer.parseInt(args[0]);
		Year year = Year.of(data);
		
		if(year.isLeap())
			System.out.printf("%d is Leap year", data);
		else
			System.out.printf("%d is NotLeap year", data);
	}

}

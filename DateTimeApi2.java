import java.time.LocalDate;
import java.time.LocalTime;
//import java.time.Month;

public class DateTimeApi2 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		//System.out.println(dd+"---->"+mm+"----->"+yy);
		System.out.printf("\n%d-%d-%d",dd,mm,yy);
		
		
		int hrs = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nn = time.getNano();
		
		System.out.println();
		System.out.printf("\n%d:%d:%d:%d",hrs,min,sec,nn);
		System.out.println();
		System.out.println(hrs+"---->"+min+"---->"+sec+"---->"+nn);
	}

}

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeApi4 {

	public static void main(String[] args) {
		
		ZoneId zone= ZoneId.systemDefault();
		ZonedDateTime zt = ZonedDateTime.now();
		System.out.println(zone);
		System.out.println(zt);
		
		System.out.println();
		
		ZoneId za = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt1 = ZonedDateTime.now(za);
		System.out.println(za);
		System.out.println(zt1);
		
		System.out.println("============");
		ZoneId zid=ZoneId.systemDefault();
		System.out.println(zid);
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		System.out.println("============");
		ZoneId zid1 = ZoneId.of("America/Toronto");
		ZonedDateTime zdt1 = ZonedDateTime.now(zid1);
		System.out.println(zid1);
		System.out.println(zdt1);
	}

}

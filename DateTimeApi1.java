
public class DateTimeApi1 {

	public static void main(String[] args) {
		
		java.util.Date utilDate = new java.util.Date();//general purpose
		System.out.println(utilDate);//Tue Feb 21 22:27:05 IST 2023
		
//		long hour = utilDate.getHours();
//		System.out.println(hour);//22
		
		long l = utilDate.getTime();//It is giving the information of utilDate in milliseconds from 1970
		System.out.println(l+"ms");//1676999391971 stores info in millisec
		
		
//		java.sql.Date sql1Date = new java.sql.Date(hour);
//		System.out.println(sql1Date);//db operations//1970-01-01
		
		System.out.println();
		
		java.sql.Date sql2Date = new java.sql.Date(l);
		System.out.println(sql2Date);//2023-02-21(yyyy-mm-dd)
	}

}

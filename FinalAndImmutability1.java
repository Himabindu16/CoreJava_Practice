
public class FinalAndImmutability1 {

	public static void main(String[] args) {
		
		 final StringBuffer sb = new StringBuffer("sachin");
		 sb.append("IND");
		 System.out.println(sb);	//sachinIND
		 
//		 sb =new StringBuffer("tendulkar");
//		 System.out.println(sb);  error

	}

}

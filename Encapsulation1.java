class Books
{
	private int pgNo;	//private- outside the class we cannot access-
	
	public void setPgNo(int x)
	{
		if(x>0) 
		{
			pgNo=x;
		}
		else
		{
			System.out.println("Invalid input to my property");
		}
	}
	
	public int getPgNo()
	{
		return pgNo;
	}

}

public class Encapsulation1 {

	public static void main(String[] args) {
		
		Books b = new Books();
//		b.pgNo=100;
//		b.pgNo=-100; //It will also takes -100 but book doesnot have -ve pgNo, so we have to protect it
//		System.out.println(b.PgNo);
		b.setPgNo(-100);
		System.out.println(b.getPgNo());
		
	}

}

package day12;

public class AccountMain {

	public static void main(String[] args) 
	{
		Account acc=new Account();
		
		acc.setAccno(1001);
		acc.setAmount(10000);
		acc.setAccname("Sasi");
		
		int s=acc.getAccno();
		System.out.println(s);
		System.out.println(acc.getAmount());
		System.out.println(acc.getAccname());
		
		
		
		
		

	}

}

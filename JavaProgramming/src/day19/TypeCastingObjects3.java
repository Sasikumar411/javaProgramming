package day19;

//A b=(C) d;

public class TypeCastingObjects3 {

	public static void main(String[] args) 
	{
		//Ex 1:
		//Object o=new String("Welcome");
		//StringBuffer sb=(StringBuffer) o;      //Rule 1-pass    Rule 2-pass    Rule 3-failed
		
		//Ex 2:
		//String s=new String("welcome");
		//StringBuffer sb=(StringBuffer) s;      //Rule 1-failed
		
		//Ex 3:
		//Object o=new String ("welcome");
		//StringBuffer sb=(StringBuffer) o;      //Rule 1-pass    Rule 2-pass    Rule 3-failed 
		
		//Ex 4:
		//Object o=new String ("welcome");
		//StringBuffer sb=(String) o;            //Rule 1-pass    Rule 2-failed 

		//Ex 5:
		//String s=new String("welcome");
		//StringBuffer sb=(String) s;            //Rule 1-pass    Rule 2-failed
		
		//Ex 6:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o;      //Rule 1-pass    Rule 2-pass    Rule 3-failed
		
		//Ex 7:
		Object o=new String("welcome");
		String s=(String) o;                     //Rule 1-pass    Rule 2-pass   Rule 3-pass
		
		System.out.println(s);
		
	}

}

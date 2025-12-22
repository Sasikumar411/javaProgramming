package day3;

public class IncreamentOperator {

	public static void main(String[] args) 
	{
		// ++ is called increment operator
		
//case:1
		/*int a=10;
		System.out.println(a);
		a++;                  //it is equal to a=a+1;
		System.out.println(a);*/
		
//case:2 (post increment)
		/*int a=10;
		int res=a++;    //1st a value assigned to the var(res), after the increment got happened, which ic called post incrementation)
		System.out.println(res);  //10
		System.out.println(a);    //11
		*/
		
//case:3 (pre increment)
		int a=10;
		int res=++a;    //1st a increnent got happened, then the incremented value got stored in a var(res), which ic called pre incrementation)
		System.out.println(res); //11
		
		

	}

}

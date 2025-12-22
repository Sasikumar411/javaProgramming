package day3;

public class DecrementOperator {

	public static void main(String[] args)
	{
		// -- is called decrement operator
		
//case:1 
		/*int a=10;
		a--;    //a=a-1;
		System.out.println(a); */
		
//case:2  post decrement
		int a=100;
		int res=a--;
		System.out.println(res);  //100
		System.out.println(a);  //99
		
//case:3   predecrement
		/*int a=100;
		int res=--a;
		System.out.println(res);
		System.out.println(a);*/

	}

}

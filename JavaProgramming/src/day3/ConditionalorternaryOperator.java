package day3;

public class ConditionalorternaryOperator {

	public static void main(String[] args) 
	{
//ex:1
		int a=100,b=200;
		int x=(a<b)? a: b;
		System.out.println(x);
		
//ex:2
		/*int x=(1==1)? 100:200;
		int y=(1!=1)? 100:200;
		System.out.println(y);*/
		
//ex:3
		/*int person_age=30;
		String res=(person_age>=18)? "Eligible":"Not Eligible";
		System.out.println(res);*/
		
//ex:4
		float height=7.5F;
		String res=(height>=7)? "Eligible": "not eligible";
		System.out.println(res);
	}

}

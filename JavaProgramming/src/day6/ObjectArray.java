package day6;

public class ObjectArray {

	public static void main(String[] args) 
	{
		Object a[]= {100, "sasi", 'S', true, 4.6};
		
		//enhaned for loop
		
		/*for(Object x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println();*/
		
		
		//normal for loop
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			
		}

	}

}

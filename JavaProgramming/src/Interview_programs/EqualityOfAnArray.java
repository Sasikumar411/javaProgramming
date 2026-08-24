package Interview_programs;

public class EqualityOfAnArray {

	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50};
		
		boolean status=true;
		
		if(a.length==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
			}
		}
		else {
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
}

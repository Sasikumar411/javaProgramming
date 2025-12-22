package day7;

public class SearchingElementInAnArray 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60};
		int search_element=50;
		boolean status=false;   //false - element not found; true - element found
		
		for(int i=0; i<a.length; i++)
		{
			if(search_element==a[i])
			{
				System.out.println("Element found"); 
				status=true;
				break;
			}
		}
		if(status==false)
		System.out.println("Element not found");
		
		
		//enhanced for loop
		
		/*for(int num:a)
		{
			if(search_element==num)
			{
				System.out.println("Element got found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}*/
		
		
		
		
		
		
    }

}

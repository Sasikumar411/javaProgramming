package day7;

public class findTheNumberOfRepetation {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,3,3,3,5};
		int search_element=3;
		int count=0;
		
		for(int x:a)
		{
			if(x==search_element)
			{
				count++;	
			}
		}
		System.out.println(count);
	}

}

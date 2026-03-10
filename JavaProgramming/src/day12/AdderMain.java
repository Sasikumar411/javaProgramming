package day12;

public class AdderMain {

	public static void main(String[] args) 
	{
		Adder addobj=new Adder();
		
		addobj.sum();
		
		addobj.sum(100, 200);
		
		addobj.sum(10.5, 20);
		
		addobj.sum(10, 34.5);
		
		addobj.sum(10,20,30);
		
		//addobj.sum(10.5,20.5,15.0); - Invalid arguement
		
		
		

	}

}

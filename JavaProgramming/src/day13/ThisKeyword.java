package day13;



public class ThisKeyword {

	int x,y;    //class variables / instance variables
	
	/*ThisKeyword(int x, int y)
	{
		this.x=x;        //this keyword always belongs to class variable or object
		this.y=y;
	}*/
	
	void setData(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	
	
	void showvalue()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
		/*ThisKeyword th=new ThisKeyword(100,200);
		th.showvalue();*/
		
		ThisKeyword th=new ThisKeyword();
		th.setData(100, 200);
		th.showvalue();
	
	}

}

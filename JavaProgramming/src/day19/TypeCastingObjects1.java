package day19;

class Parent{
	
	String name="Sasi";
	
	void m1()
	{
		System.out.println("This is m1 from parent");
	}
}

class Child extends Parent{
	
	int id=101;
	
	void m2()
	{
		System.out.println("This is m2 from child");
	}
	
}

public class TypeCastingObjects1 {

	public static void main(String[] args) {
		
		/*Child c=new Child();
		System.out.println(c.name); //parent
		c.m1();    //parent
		c.m2();   //child
		System.out.println(c.id); //child */
		
		/*Parent p=new Child();    //upcasting
		
		System.out.println(p.name);  //parent
		p.m1();     //parent         //child class variables and methods cannot access
		*/
		
		
		//downcasting
		Parent p=new Parent();
		Child c=(Child) p;
		
		System.out.println(c.id);
		System.out.println(c.name);
		c.m1();
		c.m2();
	
		
	
		
		
		


	}

}

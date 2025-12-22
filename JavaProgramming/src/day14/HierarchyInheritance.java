package day14;

class Parent
{
	void display(String a)
	{
		System.out.println(a);
	}
}

class Child1 extends Parent 
{
	int a=100;
	void show(int b)
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	void print(double c)
	{
		System.out.println(c);
	}
}



public class HierarchyInheritance {

	public static void main(String[] args) 
	{
		
		Parent p=new Parent();
		p.display("Sasi");
		
		Child1 c1=new Child1();
		c1.show(10);
		c1.display("Sasi");
		System.out.println(c1.a);
		
		Child2 c2=new Child2();
		c2.display("Kumar");
		c2.print(21);
		
		
		
	

	}

}

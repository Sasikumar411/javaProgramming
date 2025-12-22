package day15;

public class Animal {
	
	String color="White";
	
	void eat()
	{
		System.out.println("eatingggg.....");
	}
	
}

class Dog extends Animal
{
	String color = "Black";
	
	void displayColor()
	{
		System.out.println(super.color); //super keyword invoke the parent class variable to display
	}
	void eat()
	{
		System.out.println("eating bread.........");
		super.eat(); //super keyword invoke the parent class variable to display
	
	}
}

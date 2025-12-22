package day19;

//Cat ct=(Cat) an;   //cat -A; ct -B; Cat -C; an -D;

class Animal
{
}

class Dog extends Animal {}
class Cat extends Animal {}


public class TypeCastingObjects2 {

	public static void main(String[] args) {
		
		//Rule 1: Conversion is valid or not
		//The type  of ‘d’ and ‘c’ must have some relationship (either parent to child or child to parent)
		
		//Animal an=new Animal();
		//Cat ct=(Cat) an;     //valid as per the rule 1
		
		//Dog dg=new Dog();
		//Cat ct=(Cat)dg;      //invalid as per rule 1
		
		//Rule 2: Assignment is valid or not
		//‘C’ must be either same or child of ‘A’
		
		//Animal an=new Dog();
		//Cat ct=(Cat) an;   //valid as per rule 2
		
		//Animal an=new Dog();
		//Cat ct=(Dog) an;     //invalid as per rule 2
		
		//Rule 3: The underlying object type of ‘D’ must be either same or child of ‘C’
		
		//Animal an=new Dog();
		//Cat ct=(Cat) an;   //invalid as per rule 3
		
		// Rule 1; Rule 2; Rule 3:
		
		Animal an=new Dog();
		Dog dg=(Dog) an;      //Rule 1-yes    Rule 2-yes    Rule 3-yes
		
		
		
		
		
		
		
		

	}

}

package day10;

public class EmployeeMain {

	public static void main(String[] args)
	{
		Employee emp1=new Employee(); //object
		emp1.eid=101;
		emp1.ename="Sasi";
		emp1.job="Manager";
		emp1.sal=50000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="John";
		emp2.job="Developer";
		emp2.sal=60000;
		emp2.display();

	}

}

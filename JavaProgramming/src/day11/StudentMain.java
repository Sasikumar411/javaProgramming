package day11;

public class StudentMain {

	public static void main(String[] args) 
	{
		//Student stu=new Student();
		
		// 1)using object refernce variables
		/*stu.sid=101;
		stu.sname="Sasi";
		stu.grade="A";*/
		
		//using method
		
		//stu.setStudentData(102, "Sasi", "A+");
		//stu.printStudentData();
		
		
		//using constructor
		Student s=new Student(103, "Sasi", "B-");
		s.printStudentData();
		
	}

}

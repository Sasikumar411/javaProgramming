package day11;

public class Student {
	
	int sid;
	String sname;
	String grade;
	
	void printStudentData()
	{
		System.out.println(sid+"   "+sname+"   "+grade);
	}
	
	void setStudentData(int id,String name,String gr)
	{
		sid=id;
		sname=name;
		grade=gr;
		
	}
	Student(int id, String name, String gr)
	{
		sid=id;
		sname=name;
		grade=gr;
	}

}

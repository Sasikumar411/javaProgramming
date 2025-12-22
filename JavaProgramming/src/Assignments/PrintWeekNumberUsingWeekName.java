package Assignments;

public class PrintWeekNumberUsingWeekName {

	public static void main(String[] args) 
	{
		String week_name="tuesday";
		
		switch (week_name)
		{
		case "sunday": System.out.println("week no:1"); break;
		case "monday": System.out.println("week no:2"); break;
		case "tuesday": System.out.println("week no:3");break;
		case "wednesday": System.out.println("week no:4"); break;
		case "thursday": System.out.println("week no:5"); break;
		case "friday": System.out.println("week no:6"); break;
		case "saturday": System.out.println("week no:7"); break;
		default: System.out.println("Invalid week name");
	
		}
		

	}

}

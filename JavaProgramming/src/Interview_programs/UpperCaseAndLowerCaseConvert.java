package Interview_programs;

public class UpperCaseAndLowerCaseConvert {

	public static void main(String[] args) 
	{
		String input="Java AuTOmaTiOn";
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0; i<input.length(); i++)
		{
			char ch=input.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				result.append((char)(ch+32));
			}
			else if(ch>='a' && ch<='z') {
				result.append((char)(ch-32));
			}
			else {
				result.append(ch);
			}
		}
		System.out.println("Input: "+input);
		System.out.println("Output: "+result);

	}

}

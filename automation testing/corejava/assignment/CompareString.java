package assignment;

public class CompareString 
{
    public static void main(String[] args) 
    {
		String str1="Hello";
		String str2="hello";
		
		if(str1.equals(str2)) // case sensitive comparision
		{
			System.out.println("The strings are equal.");
		}
		else
		{
			System.out.println("The strings are not equal.");
		}
		 if(str1.equalsIgnoreCase(str2))
		 {
			 System.out.println("The strings are equal ignoring case.");
		 }
		 else
		 {
			 System.out.println("The strings are not equal ignoring case.");
		 }
	}
}

package assignment;

public class FactorialProgram 
{
    public static void main(String[] args) 
    {
		int no=5;
		int factorial=1;
		for(int i=1; i<=no; i++)
		{
			factorial *=i;
	    }
		System.out.println("Factorial of" + no + " is: " + factorial);
	}
}

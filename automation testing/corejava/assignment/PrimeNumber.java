package assignment;

public class PrimeNumber 
{
     public static void main(String[] args) 
     {
		int no=11;
		boolean isprime=true;
		
		if (no <= 1)
		{ 
			isprime=false;
		}
		else
		{
			for (int i=2; i<= Math.sqrt(no);i++)
			{
				if(no % i==0)
				{
					isprime=false;
					break;
				}
			}
		}
		if(isprime)
		{
			System.out.println(no + "is a prime number.");
		}
		else
		{
		    System.out.println(no + "is not a prime number.");
		}
	}
}

package assignment;

public class SumOfFirst100Primes 
{
     public static void main(String[] args) 
     {
		int count=0;
		long sum=0;
		int number=2; //start with the first prime number 
		
		while(count<100)
		{
			if (isPrime(number))
			{
				sum+=number;
				count++;
			}
			number++;
		}
		System.out.println("Sum of the first 100 prime numbers:"+sum);
     }
		//method to check if a number is prime 
     public static boolean isPrime(int num)
     {
     if(num<=1)
     {
    	 return false;
     }
     for (int i=2; i<=Math.sqrt(num);i++)
    	 if(num % i==0)
    	 {
    	 return false;
         }  
      return true;
   }
}
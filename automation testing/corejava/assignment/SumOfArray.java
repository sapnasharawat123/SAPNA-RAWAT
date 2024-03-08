package assignment;

public class SumOfArray 
{
   public static void main(String[] args) 
   {
	int[]array= {1,2,3,4,5}; //example array
	int sum = sumArray(array);
	System.out.println("Sum of the array"+sum);
}
   public static int sumArray(int[]arr)
   {
	   int sum=0;
	   for(int value : arr) 
	   {
		   sum+=value;
	   }
	   return sum;
   }
 }

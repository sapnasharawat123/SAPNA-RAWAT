package assignment;

public class MiniMaxiOfArray 
{
   int[]array = {10,20,30,40,50};
   int max=findMax(array);
   int min=findMin(array);//find maximum and minimum values 
   {
	   System.out.println("Maximum value:"+ max);
	   System.out.println("Minimum value:"+ min); // output the result
   }
   public static int findMax(int[] array) 
   {
	   int max = array[0];
	   for(int i=1;i<array.length;i++)
	   {
		   if(array[i]>max)                     //method to find maximum value in an array
		   {
			   max=array[i];
		   }
	}
	   return max;
}
   public static int findMin(int[] array) 
   {
	   int min = array[0];
	   for(int i=1;i<array.length;i++)
	   {
		   if(array[i]>min)                     //method to find maximum value in an array
		   {
			   min=array[i];
		   }
	}
	   return min;
    }
}
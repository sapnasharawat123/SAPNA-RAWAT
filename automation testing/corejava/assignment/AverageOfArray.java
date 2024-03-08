package assignment;

public class AverageOfArray 
{
    public static void main(String[] args) 
    {
		int[]array = {1,2,3,4,5};
		double average = calculateAverage(array);
		System.out.println("Average of the array:"+average);
	}
    public static double calculateAverage(int[]arr)
    {
    	if (arr.length==0)
    	{
    		return 0;//handle empty array to avoid divisionby zero
    	}
    	int sum=0;
    	for(int value : arr)
    	{
    		sum+=value;
    	}
    	return (double) sum/arr.length;
    }
}

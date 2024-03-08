package assignment;

public class SecondLargestElement 
{
    public static void main(String[] args) 
    {
		int[]arr= {5,8,6,9,3,7};
		int secondLargest = findSecondLargest(arr);
		System.out.println("second largest element in the array:"+secondLargest);
	}
    public static int findSecondLargest(int[]arr) 
    {
    	int largest=Integer.MIN_VALUE;
    	int secondLargest=Integer.MIN_VALUE;
    	
    	for(int num:arr)
    	{
    		if(num>largest)
    		{ 
    			secondLargest=largest;
    			largest=num;
    		}
    		else if (num > secondLargest && num !=largest)
    		{
    			secondLargest=num;
    		}
    			
    	}
    	return secondLargest;
    }
}

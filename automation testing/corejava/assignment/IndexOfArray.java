package assignment;

public class IndexOfArray 
{
	public static void main(String[] args) 
	{
	int[]array= { 100,200,300,400,500};//sample array
	
	int elementToFind=500; // element to search
	int index =findIndex(array, elementToFind);//find the index of the element
	
	if(index !=-1)
	{
		System.out.println("Element "+ elementToFind + " found at index:"+index);
	}
	else
	{
		System.out.println("Element"+ elementToFind + "not found in the array.");
	}
  }

	private static int findIndex(int[] array, int elementToFind) 
	{
		for(int i=0; i< array.length; i++)
		{
			if(array[i]==elementToFind)
			{
				return i; //Element found return its index
			}
		}
// TODO Auto-generated method stub
		return -1;
	}
}
	
	
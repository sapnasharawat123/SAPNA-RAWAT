package assignment;

public class UpdateArrayElement 
{
    public static void main(String[] args) 
    {
		String[]fruits= {"Apple","Banana","Orange","Grapes"};//create an array
		
		System.out.println("Original array");
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		int indexToUpdate=1; //Index of element to update
		String newFruit="Mango";//new element
		if(indexToUpdate >= 0 && indexToUpdate < fruits.length)
		{
			fruits[indexToUpdate]=newFruit;
			System.out.println("\nArray after updating element at index"+indexToUpdate+":");
			for(String fruit: fruits)
			{
				System.out.println(fruit);
			}
		}
			else
			{
				System.out.println("\nIndex out of bounds. please provide a valid index.");
			}
		}
	}


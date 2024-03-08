package assignment;

import java.util.ArrayList;

public class ArrayListIteration 
{
    public static void main(String[] args) 
    {
		ArrayList<String>arrayList=new ArrayList<>();
		
		arrayList.add("rose");
		arrayList.add("sunflower");
		arrayList.add("lotus");
		arrayList.add("lily");
		
		System.out.println("Iterating through the ArrayList using a for-each loop:");
		for(String fruit: arrayList)
		{
			System.out.println(fruit);
		}
		System.out.println("\nIterating through the ArrayList using a traditional for loop:");
		for(int i=0; i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
	}
}

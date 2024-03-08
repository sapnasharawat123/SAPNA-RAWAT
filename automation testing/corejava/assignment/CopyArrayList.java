package assignment;

import java.util.ArrayList;

public class CopyArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> sourceList=new ArrayList<>();
		sourceList.add("sonali");
		sourceList.add("kamiya");
		sourceList.add("Sapna");
		
		ArrayList<String>destinationList=new ArrayList<>();
		for (String element : sourceList)
		{
			destinationList.add(element);
		}
		System.out.println("Destination ArrayList");
		System.out.println(destinationList);
	}
}

   


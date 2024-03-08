package assignment;

import java.util.ArrayList;

public class RemoveThirdArray 
{
  public static void main(String[] args) 
  {
	  ArrayList<String>arrayList=new ArrayList<>();
	  
	  arrayList.add("Rahul");
	  arrayList.add("Sapna");
	  arrayList.add("Asha");
	  arrayList.add("Dilip");
	  
	  System.out.println("Original ArrayList:");
	  System.out.println(arrayList);
	  
	  if(arrayList.size() >=3) 
	  {
		  arrayList.remove(2);
		  System.out.println("\nArrayList after removing the third element:");
		  System.out.println(arrayList);
	  }
	  else 
	  {
		  System.out.println("\nArrayList after removing the third element:");
		  
	  }
   }
}

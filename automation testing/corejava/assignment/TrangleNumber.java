package assignment;

import java.util.Scanner;

public class TrangleNumber
{
    public static void main(String[] args)
    	    {
    	        Scanner sc = new Scanner(System.in);
    	 
    	        System.out.println("How many rows you want in this pattern?");
    	 
    	        int rows = sc.nextInt();
    	 
    	        System.out.println("Here is your pattern....!!!"); 
    	 
    	        for (int i = 1; i <= rows; i++)
    	        {
    	            //Printing rows-i spaces at the beginning of each row
    	 
    	            for (int j = 1; j <= rows-i; j++)
    	            {
    	                System.out.print(" ");
    	            }
    	 
    	            //Printing i value i times at the end of each row
    	 
    	            for (int j = 1; j <= i; j++)
    	            {
    	                System.out.print(i+" ");
    	            }
    	 
    	            System.out.println();
    	        }
    	       sc.close();
    	    }
    }

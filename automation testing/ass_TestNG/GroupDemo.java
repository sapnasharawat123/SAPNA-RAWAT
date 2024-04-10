package com.ass_TestNG;

import org.testng.annotations.Test;

public class GroupDemo 
{
	
		  @Test(groups= {"red"})
		   public void red1()
		   {
			   System.out.println("This is Red1...");
		   }
		   @Test(groups= {"red"})
		   public void red2()
		   {
			   System.out.println("This is Red2...");
		   }
		   @Test(groups= {"red"})
		   public void red3()
		   {
			   System.out.println("This is Red3...");
		   }
		   @Test(groups= {"green"})
		   public void green1()
		   {
			   System.out.println("This is Green1...");
		   }
		   @Test(groups= {"green"})
		   public void green2()
		   {
			   System.out.println("This is Green2...");
		   }
		   @Test(groups= {"green"})
		   public void green3()
		   {
			   System.out.println("This is Green3...");
		   }
		   @Test(groups= {"red","green"})
		   public void red_green()
		   {
			   System.out.println("This is Red_Green1...");
		   }
		}



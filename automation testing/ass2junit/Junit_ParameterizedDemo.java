package com.ass2junit;


	import java.util.Arrays;
	import java.util.Collection;

	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.junit.runners.Parameterized;
	


	@RunWith(Parameterized.class)
	public class Junit_ParameterizedDemo 
	{
	  String gmail, password, login;
	  String a1=null;
	  public Junit_ParameterizedDemo(String gmail, String password)
	  {
		this.gmail=gmail;
		this.password=password;
	  }
	  @Parameterized.Parameters
	  public static Collection input()
	  {
		 return Arrays.asList(new Object[][] {{"sapnasharawat@gmail.com","sapna1999"}});
	  }
	  @Before
	  public void before()
	  {
	     a1=new String();
	  }
	    @Test
		  public void test()
		  {
			 // System.out.println("Expected Number is..."+eno);
			 // Assert.assertEquals(eno,a1.sum(fno,sno));
		  }

	  }

	 
	
	

	



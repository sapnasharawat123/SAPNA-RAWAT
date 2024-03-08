package assignment;

public class TryCatchBlock 
{
   public static void main(String[] args) 
   {
	   try
	   {
		   int result = divide(10,2);   
		   System.out.println("Result:"+result);
	   }
	   catch (ArithmeticException e)
	   {
		   System.out.println("Error: Division by zero");
		   e.printStackTrace();
       }
    }
   
   public static int divide(int dividend, int divisor)
   {
	   return dividend/divisor;
   }
 }

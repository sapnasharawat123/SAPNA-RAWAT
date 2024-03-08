package assignment;

public class MultipleCatchBlocks 
{
     public static void main(String[] args) 
     {
		try
		{
			int[]numbers= {1,2,3,4};
			int result=numbers[4];
			
			String str=null;
			int length=str.length();
		}
			catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds exception:"+ e.getMessage());
        }
            catch(NullPointerException e)
		{
            	System.out.println("Null pointer exception:"+ e.getMessage());
		}
		     catch (Exception e)
		{
			System.out.println("An exception occured:"+e.getMessage());
		}
	}
}

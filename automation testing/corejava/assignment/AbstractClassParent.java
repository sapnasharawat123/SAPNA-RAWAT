package assignment;


abstract class Parent
{
	void message() {}
}
   class Subclass1 extends Parent
   {
	   @Override
	   
	   void message() 
	   {
		   
		   System.out.println("This is first subclass...");
       }
    }
class Subclass2 extends Parent
{ 
	 @Override
	   
	   void message() 
	   {
		   
		   System.out.println("This is second subclass...");
     }
}
public class AbstractClassParent
{
	public static void main(String[] args) 
	{
// firstsubclass obj=new firstSubclass();
		Subclass1 s1=new Subclass1();
		
		Subclass2 s2=new Subclass2();
		
		s1.message();
		s2.message();
	}
}

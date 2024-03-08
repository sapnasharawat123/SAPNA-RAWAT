package assignment;

public class RunnableInterface implements Runnable
{
  public void run()
  {
	  for(int i=1; i<5; i++)
  {
		  System.out.println("Hello from thread:"+Thread.currentThread().getName());
	  try
	  {
		  Thread.sleep(1000);
	  }
	  catch(InterruptedException e)
	  {
		  System.out.println("Thread interrupted");
	  }
   }
}
   public static void main(String[] args) 
   {
	   RunnableInterface RunnableInterface = new RunnableInterface();
	   
	   Thread thread = new Thread(RunnableInterface);
	   
	   thread.start();
	   
	   for(int i=0; i<5; i++)
	   {
		   System.out.println("Hello from main thread");
		   try
		   {
			   thread.sleep(2000);
		   }
		   catch(InterruptedException e)
		   {
			   System.out.println("Main thread interrupted");
		   }
	   }
   }
	
}

package assignment;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("This is a thread created by extending the Thread class.");
	}
}
public class ThreadCreation 
{
    public static void main(String[] args) 
    {
		MyThread thread = new MyThread();
		thread.start();
	}
}

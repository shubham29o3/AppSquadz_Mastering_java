
public class ThreadJoinExample
{
	public static void main(String args[])
	{
		Thread t1=new Thread(new MyRunnable(),"t1");
		Thread t2=new Thread(new MyRunnable(),"t2");
		Thread t3=new Thread(new MyRunnable(),"t3");
		
		t1.start();
		//start second Thread after waiting for 2 seconds or if it's dead.
		try
		{
			t1.join(2000);
		}
		catch(Exception e)
		{
		      e.printStackTrace();
		}
		
		t2.start();
		
		//start third thread only when first Thread is dead.
		t3.start();
		try{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("All Threads are dead, exiting main Thread");
	}
}

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Thread started:::"+Thread.currentThread().getName());
		
		try
		{
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread ended:::"+Thread.currentThread().getName());
	}
}
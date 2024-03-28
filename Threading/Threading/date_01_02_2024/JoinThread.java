

public class JoinThread
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1("thread-1");
		Thread2 t2=new Thread2("thread-2");
		Thread3 t3=new Thread3("thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		for(int i=1;i<=20;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Thread1 extends Thread
{
	Thread1(String s)
	{
		super(s);
		//start();
	}
	public void run()
	{
	      for(int i=1;i<=5;i++)
		  {
			  System.out.println(Thread.currentThread().getName());
			  
			  try                    //1000 millisecond =1 second
			  {
				  Thread.sleep(1000); //(long millisecond) throw InterrruptedException(Check excepiton)
			  }
			  catch(Exception e)
			  {
				  System.out.println(e);
			  }
		  }
		  System.out.println(getName()+" dead");
	}
}
class Thread2 extends Thread
{
	Thread2(String s)
	{
		super(s);
		//start();
	}
	public void run()
	{
	      for(int i=1;i<=5;i++)
		  {
			  System.out.println(Thread.currentThread().getName());
			  
			  try                    //1000 millisecond =1 second
			  {
				  Thread.sleep(1000); //(long millisecond) throw InterrruptedException(Check excepiton)
			  }
			  catch(Exception e)
			  {
				  System.out.println(e);
			  }
		  }
		  System.out.println(getName()+" dead");
	}
}
class Thread3 extends Thread
{
	Thread3(String s)
	{
		super(s);
		//start();
	}
	public void run()
	{
	      for(int i=1;i<=5;i++)
		  {
			  System.out.println(Thread.currentThread().getName());
			 
			  try                    //1000 millisecond =1 second
			  {
				  Thread.sleep(1000); //(long millisecond) throw InterrruptedException(Check excepiton)
			  }
			  catch(Exception e)
			  {
				  System.out.println(e);
			  }
		  }
		  System.out.println(getName()+" dead");
	}
}
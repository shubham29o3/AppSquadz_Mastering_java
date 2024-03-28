

//inheritance
/*
    t2 join t1.
*/

public class Ex
{
     public static void main(String args[])
	 {
		 Thread1 t1=new Thread1("t1");
		 t1.start();
	 }
}
class Thread1 extends Thread
{
	Thread1(String s)
	{
		super(s);
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		      System.out.println(Thread.currentThread().getName());
		}
		
		Thread2 t2=new Thread2("t2");
		t2.start();
		
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		for(int i=1;i<=5;i++)
		{
		     System.out.println("after::"+getName());
		     try
		     {
			     Thread.sleep(2000);
		     }
		     catch(Exception e)
		     {
				 System.out.println(e);
		     }
		}
	}
}
class Thread2 extends Thread
{
	Thread2(String s)
	{
		super(s);
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		    System.out.println(Thread.currentThread().getName());
		    try
		    {
			     Thread.sleep(2000);
		    }
		    catch(Exception e)
		    {
				System.out.println(e);
		    }
		}
	}
}
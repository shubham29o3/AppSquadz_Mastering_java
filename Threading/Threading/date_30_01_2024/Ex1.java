
//when we give name to one thread and not second thread.

public class  Ex1
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1("Thread-0");
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
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
		//System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
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
	/*
	Thread2(String s)
	{
		super(s);
	}
	*/
	public void run()
	{
		//System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName());
			
			try{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
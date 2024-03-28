


public class Ex1
{
	public static void main(String args[])
	{
		Thread t1=new Thread(new MyRun1(),"t1");
		t1.start();
	}
}
class MyRun1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
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
		Thread t2=new Thread(new MyRun2(),"t2");
		t2.start();
		try
		{
			t2.join(4000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println("after join:"+Thread.currentThread().getName());
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
class MyRun2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
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
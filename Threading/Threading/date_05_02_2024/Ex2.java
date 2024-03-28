

public class Ex2
{
	
	public static void main(String args[])
	{
		S d=new S();
		Thread1 t1=new Thread1(d,"t1");
		Thread2 t2=new Thread2(d,"t2");
	}
	
}
class Thread1 extends Thread
{
	S s;
	Thread1(S s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run()
	{
		
		System.out.println(Thread.currentThread().getName());
		s.show();
	}
}
class Thread2 extends Thread
{
	S s;
	Thread2(S s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run()
	{
	
		System.out.println(Thread.currentThread().getName());
		s.show1();
	}
}
class S
{
	
   synchronized	void show()
	{
		System.out.println("show-1");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
    synchronized void show1()
	{
		System.out.println("show-2");
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
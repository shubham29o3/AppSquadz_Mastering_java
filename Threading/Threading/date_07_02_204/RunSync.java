

public class RunSync
{
	public static void main(String args[])
	{
		Shared st=new Shared();
		Thread1 t1=new Thread1(st,"one");
		Thread2 t2=new Thread2(st,"two");
	}
}
class Thread1 extends Thread
{
	Shared s;
	Thread1(Shared s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run()
	{
		System.out.println(s.withdraw());
	}
}
class Thread2 extends Thread
{
	Shared s;
	Thread2(Shared s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run()
	{
		s.submit();
	}
}
class Shared
{
	int flag=0;
	int data=0;
	
	synchronized public void submit()
	{
		flag=1;
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		data=10;
		System.out.println("value submitted");
		notify();
	}
	synchronized int withdraw()
	{
		if(flag==0)
		{
			try
			{
			  System.out.println("sending into wait block");
              wait();			  
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return data;
	}
}
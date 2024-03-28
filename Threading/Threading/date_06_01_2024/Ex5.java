

public class Ex5
{
   public static void main(String args[])
   {
	   Shared st=new Shared();
	   CustomThread1 t1=new CustomThread1(st,"t1");
	   CustomThread2 t2=new CustomThread2(st,"t2");
   }
}
class CustomThread1 extends Thread
{
	Shared s;
	public CustomThread1(Shared s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run()
	{
		s.show(Thread.currentThread().getName(),10);
	}
}
class CustomThread2 extends Thread
{
	Shared s;
	public CustomThread2(Shared s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run()
	{
		s.show(Thread.currentThread().getName(),20);
	}
}
class Shared
{
	int x;
	 synchronized void show(String s,int a)
	{
		System.out.println("starting method "+s);
		Temp t=new Temp();
		synchronized(t)
		{
			t.dilTohPagalHai(s);
		}
	}
}
class Temp
{
	void dilTohPagalHai(String s)
	{
		System.out.println("starting ha mai hoo in dilTohPagalHai :"+s);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("ending from dilTohPagalHai :"+s);
	}
}
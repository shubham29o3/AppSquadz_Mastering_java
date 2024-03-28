
public class RunSync
{
    public static void main(String[] args)
	{
		Shared st=new Shared();
		CustomThread1 t1=new CustomThread1(st,"One");
		CustomThread2 t2=new CustomThread2(st,"Two");
		CustomThread3 t3=new CustomThread3(st,"Three");
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
		//s.show(Thread.currentThread().getName(),1);
		System.out.println("Thread1 sum of 10,20 = "+s.add(10,20));
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
		//s.show(Thread.currentThread().getName(),2);
		System.out.println("Thread1 sum of 100,200 = "+s.add(100,200));
	}
}
class CustomThread3 extends Thread
{
	Shared s;
	public CustomThread3(Shared s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run()
	{
		//s.show(Thread.currentThread().getName(),3);
		System.out.println("Thread1 sum of 1000,2000 = "+s.add(1000,2000));
	}
}
class Shared
{
     private int x;
	 private int y;
    
    synchronized void show(String s,int a)
	{
		x=a;
		System.out.println("starting methods"+s+" "+x);
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("exit from methods"+s+" "+x);
	}		
	synchronized int add(int a,int b)
	{
		//System.out.println("inside add method"+Thread.currentThread().getName());
		x=a;
		y=b;
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return x+y;
	}
}

public class Ex1 
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
		int ans=s.add(10,20);
		System.out.println(Thread.currentThread().getName()+" "+ans);
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
		int ans=s.add(100,200);
		System.out.println(Thread.currentThread().getName()+" "+ans);
	}
}
class S
{
	private int x;
	private int y;
	synchronized int add(int a,int b)
	{
		this.x=a;
		this.y=b;
		
		
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
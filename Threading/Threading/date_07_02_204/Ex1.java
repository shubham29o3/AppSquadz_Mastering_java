



public class Ex1
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
       x=a;
       System.out.println("starting in method "+s+" "+x);
       Thread.currentThread().suspend();
       Thread.currentThread().resume();
       System.out.println("exit from method "+s+" "+x);	   
	}
}


public class Ex3
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
		Shared.show(Thread.currentThread().getName(),10);
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
		s.show1(Thread.currentThread().getName(),20);
	}
}
class Shared
{
	static synchronized void show(String s,int a)
	{
         System.out.println("starting in methode "+s+"  show "+a);
		 try
		 {
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println("exit from methode"+s+" show "+a);
	}
	
	 synchronized void show1(String s,int a)
	{
         System.out.println("starting in methode "+s+" show-1 "+a);
		 try
		 {
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println("exit from methode"+s+" show-1 "+a);
	}
}
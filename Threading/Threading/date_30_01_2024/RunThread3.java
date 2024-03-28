

public class RunThread3
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1("thread1");
		Thread2 t2=new Thread2("thread2");
		Thread3 t3=new Thread3("thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=1;i<=20;i++)
		{
			System.out.println(Thread.currentThread().getName());
			//System.out.println("tata");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Thread1 extends Thread
{
	Thread1(String s)
	{
		super(s);
		//start();
	}
	public void run()
	{
	      for(int i=1;i<=5;i++)
		  {
			  System.out.println(Thread.currentThread().getName());
			  //System.out.println("chay");
			  try                    //1000 millisecond =1 second
			  {
				  Thread.sleep(1000); //(long millisecond) throw InterrruptedException(Check excepiton)
			  }
			  catch(Exception e)
			  {
				  System.out.println(e);
			  }
		  }
		  System.out.println(getName()+" dead");
	}
}
class Thread2 extends Thread
{
	Thread2(String s)
	{
		super(s);
		//start();
	}
	public void run()
	{
	      for(int i=1;i<=5;i++)
		  {
			  System.out.println(Thread.currentThread().getName());
			  //System.out.println("chay");
			  try                    //1000 millisecond =1 second
			  {
				  Thread.sleep(1000); //(long millisecond) throw InterrruptedException(Check excepiton)
			  }
			  catch(Exception e)
			  {
				  System.out.println(e);
			  }
		  }
		  System.out.println(getName()+" dead");
	}
}
class Thread3 extends Thread
{
	Thread3(String s)
	{
		super(s);
		//start();
	}
	public void run()
	{
	      for(int i=1;i<=5;i++)
		  {
			  System.out.println(Thread.currentThread().getName());
			  //System.out.println("chay");
			  try                    //1000 millisecond =1 second
			  {
				  Thread.sleep(1000); //(long millisecond) throw InterrruptedException(Check excepiton)
			  }
			  catch(Exception e)
			  {
				  System.out.println(e);
			  }
		  }
		  System.out.println(getName()+" dead");
	}
}
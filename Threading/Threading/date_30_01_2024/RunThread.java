
import java.util.*;
public class RunThread
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread tt1=new Thread(t1,"Thread-1");
		tt1.start();
		
		Thread tt2=new Thread(t1,"Thread-2");
		tt2.start();
	}
}
class Thread1 implements Runnable 
{
	int x=10;
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+x);
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
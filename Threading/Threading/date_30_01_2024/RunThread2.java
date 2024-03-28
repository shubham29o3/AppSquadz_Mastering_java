
public class RunThread2
{
    public static void main(String args[])
	{
		Thread3 t1=new Thread3();
		t1.x=50;
		Thread tt1=new Thread(t1,"thread1");
		tt1.start();
		
		Thread3 t2=new Thread3();
		t2.x=100;
		Thread tt2=new Thread(t2,"thread2");
		tt2.start();
		
		Thread3 t3=new Thread3();
		t3.x=200;
		Thread tt3=new Thread(t1,"thread3");
		tt3.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		
	}
}
class Thread3 extends Thread
{
	int x=1000;
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+x);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
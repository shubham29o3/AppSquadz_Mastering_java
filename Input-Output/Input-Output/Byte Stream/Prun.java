import java.io.*;

class Poutput implements Runnable
{
	PipedOutputStream po;
	
	Poutput(PipedOutputStream po)
	{
		this.po=po;
	}
	public void run()
	{
		for(int i=65 ; i<91; i++)
		{
			try{	po.write(i); 	Thread.sleep(100);		}
			catch(Exception e){}
		}
	}
}
class Pinput implements Runnable
{
	PipedInputStream pi;
	
	Pinput(PipedInputStream pi)
	{
		this.pi=pi;
	}
	public void run()
	{
		int z=0;
		for(int i=65 ; i<91 ; i++)
		{
			try
			{
			z= pi.read();
			}
			catch(Exception e){}
			System.out.println((char) z);
		}
	}
}
class Prun 
{
	public static void main (String...s) throws IOException
	{
		PipedOutputStream pout=new PipedOutputStream();
		PipedInputStream pin=new PipedInputStream();
		pout.connect(pin);
		Poutput po=new Poutput(pout);
		Pinput pi=new Pinput(pin);
		Thread t1=new Thread(po);
		Thread t2=new Thread(pi);
		t1.start();
		t2.start();
	}
}
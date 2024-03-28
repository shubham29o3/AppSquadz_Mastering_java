import java.io.*;

class PrintOutput implements Runnable
{
	PipedWriter pout;
	
	PrintOutput(PipedWriter pout)
	{	this.pout=pout;	}
	
	public void run()
	{
		for(int i=65 ; i<=91 ; i++)
		{
			try
			{
				pout.write(i);
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class PrintInput implements Runnable
{
	PipedReader pin;
	
	PrintInput(PipedReader pin)
	{	this.pin = pin ;	}
	
	public void run()
	{
		int z=0;
		for(int i=65 ;i<=91 ; i++)
		{
			try
			{
				z=pin.read();
			}
			catch(Exception e){}
		}
	}
}
class PrintRun
{
	public static void main(String...args) throws IOException
	{
		PipedWriter pout =new PipedWriter();
		PipedReader pin = new PipedReader();
		pout.connect(pin);
		
		PrintOutput po = new PrintOutput(pout);
		PrintInput pi = new PrintInput(pin);
		
		Thread t1=new Thread(po);
		Thread t2=new Thread(pi);
		t1.start();
		t2.start();
	}
}
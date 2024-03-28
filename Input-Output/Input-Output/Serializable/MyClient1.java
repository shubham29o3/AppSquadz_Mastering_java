import java.io.*;
public class MyClient1
{
	ObjectOutputStream oout;
	public MyClient1()
	{
		try
		{
			Emp e1=new Emp("XYZ",46,47,48,49,50);
			oout =new ObjectOutputStream(new FileOutputStream("xyz.txt"));
			oout.writeObject(e1);
			oout.flush();
		}
		catch(Exception e)
		{	System.out.println(e); 	}
	}
	public static void main(String...s)
	{
		new MyClient1();
	}
}
import java.io.*;

class Client
{
	
	ObjectOutputStream oout;
	
	Client()
	{
		try
		{
			Emp e1=new Emp("Empe1" , 10 ,20, 30, 40);
			Emp e2=new Emp("Empe2" , 10, 20 ,30 ,40);
			oout=new ObjectOutputStream(new FileOutputStream("Client.txt"));
			oout.writeObject(e1);
			oout.writeObject(e2);
			oout.flush();
		}
		catch(Exception e){}
	}
	
	public static void main(String...s)
	{
		new Client();
	}
}
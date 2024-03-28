import java.io.*;

class Server
{
	ObjectInputStream oin;
	
	Server()
	{   try
		{
			oin=new ObjectInputStream(new FileInputStream("Client.txt"));
			Emp z= (Emp)oin.readObject();
			Emp z1= (Emp)oin.readObject();
		
			System.out.println("Name instance " + z.name );
			System.out.println("a static " + z.a );
			System.out.println("b transient " + z.b );
			System.out.println("Name instance" + z1.name );
			System.out.println("a static " + z1.a);
			System.out.println("b transient " + z1.b);
		}
		catch(Exception e){}	
	}
	
	public static void main(String...s)
	{
		new Server();
	}
}
import java.io.*;
public class MyServer
{
	ObjectInputStream dis;
	
	public MyServer()
	{
		try
		{
			dis=new ObjectInputStream(new FileInputStream("xyz.txt"));
			Emp em=(Emp)dis.readObject();
			System.out.println("name= " +em.name);
			System.out.println("age= " + em.age);
			System.out.println("a= " + em.a);
			System.out.println("b= " + em.b);
			System.out.println("z= " + em.z);
		}
		catch(Exception e)
		{	System.out.println(e);	 }
	}
	public static void main(String...s)
	{
		new MyServer();
	}
}

import java.io.*;

class Input
{
	FileInputStream f;
	
	void show() throws IOException           
	{
		f=new FileInputStream("out.txt");
		System.out.println(f.read());
		while( f.read() !=-1)
		{
		System.out.println(f.read());
		}
		f.close();
	}            
	public static void main(String...s) throws IOException
	{
		new Input().show();
	}
}
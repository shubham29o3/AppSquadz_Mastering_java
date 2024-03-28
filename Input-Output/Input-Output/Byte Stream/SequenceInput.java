import java.io.*;
import java.util.Enumeration;

class SequenceInput
{
	FileInputStream fin;
	FileInputStream fins;
	public static void main(String...args) throws IOException
	{
		FileInputStream fin=new FileInputStream("FileInput01.txt");
		FileInputStream fins=new FileInputStream("FileInput02.txt");
		
		//SequenceInputStream sin=new SequenceInputStream(fin , fins);
		SequenceInputStream sin=new SequenceInputStream(new MyEnum());
		
		DataInputStream din=new DataInputStream(sin);
		
		String s=" ";
		while(s!=null)
		{
			s=din.readLine();
			//if(s!=null)                                     //allow when you dont need null on console after completing file reading
				System.out.println(s);
		}
		din.close();
	}
}
 class MyEnum extends SequenceInput implements  Enumeration
{
	InputStream in[];
	int i=-1;
	MyEnum()
	{
		try
		{
			in=new InputStream[]{ new FileInputStream("FileInput03.txt") , new FileInputStream("FileInput02.txt"),  new FileInputStream("FileInput01.txt") } ;
		}
		catch(Exception e){}
	}
	
	public boolean hasMoreElements()
	{
		System.out.println("has more elements");
		if(++i < in.length)
			return true;
		
		else
			return false;
	}
	public Object nextElement()
	{
		System.out.println("nextElement " + i);
		return in[i];
	}
}
import java.io.*;

class ReadInFile
{
	public static void main (String...s)  throws IOException
	{
		FileReader rd= new FileReader("Write.txt");
		int i=rd.read();
		while(i !=-1)
		{
			System.out.print((char)i); 
			i=rd.read();
		} 
/* 		for(int i=rd.read() ; i>-1 ; i--)
		{
			System.out.print((byte)i);
		} */
		rd.close();
	}
}
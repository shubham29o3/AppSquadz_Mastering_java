import java.io.*;

class DataRead
{
	public static void main(String...s) throws IOException
	{
		DataInputStream din=new DataInputStream(new FileInputStream("PS05.txt"));
		String str=" ";
		
		while(str!=null)
		{
			str=din.readLine();
			
			if(str!=null)
				System.out.println(str);
		}
		din.close();
	}
}
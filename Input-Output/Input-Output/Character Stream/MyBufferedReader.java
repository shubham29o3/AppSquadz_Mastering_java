import java.io.*;

class MyBufferedReader
{
	public static void main(String...sa) throws IOException
	{
		FileReader fr=new FileReader("MyBufferedWriter.txt");
		BufferedReader bfr=new BufferedReader(fr);
		String s=" ";
		while(s!=null)
		{
			s=bfr.readLine();
			if(s!=null)
				System.out.println(s);
		}
	}
}
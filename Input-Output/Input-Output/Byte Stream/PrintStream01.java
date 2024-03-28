import java.io.*;

class PrintStream01
{
	public static void main(String...s) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("xyz.txt");
		PrintStream ps=new PrintStream(fout);
		ps.println("hello");
		ps.println("hiiiiii");
		System.out.println("FileCreated");
	}
}
import java.io.*;

class MyPrintWriter
{
	public static void main(String...args) throws IOException
	{
		FileWriter fw=new FileWriter("printwriter.txt");
		PrintWriter pw=new PrintWriter(fw);
		pw.println("hello");
		pw.println("hay");
		pw.close();
		System.out.println("File created");
	}
}
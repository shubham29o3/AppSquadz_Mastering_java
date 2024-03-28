import java.io.*;

class PrintStream02
{
	public static void main(String...s) throws IOException
	{
		FileOutputStream os=new FileOutputStream("PrintStream.txt");
		PrintStream ps=new PrintStream(os);
		System.out.println("PrintStream connected to file PrintStream.txt ");
		System.setOut(ps);
		System.out.println("This line is not print in console but in PrintStream.txt File");
	}
}
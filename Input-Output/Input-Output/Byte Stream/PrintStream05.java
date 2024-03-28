import java.io.*;

class PrintStream05
{
	public static void main(String...s) throws IOException
	{
		// we use DataInputStream without using FileInputStream referene because (System.in) method real value of keyboard in console
		DataInputStream din=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("PS05.txt");
		
		PrintStream ps=new PrintStream(fout);
		
		String str=" ";
		while ( ! str.equals("stop"))
		{
			str=din.readLine();
			ps.println(str);
		}
		din.close();
		ps.close();
	}
}
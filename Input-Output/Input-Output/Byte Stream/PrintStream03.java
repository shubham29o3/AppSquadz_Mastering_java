import java.io.*;

class PrintStream03
{
	public static void main(String...s) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("PS03.txt");
		PrintStream ps=new PrintStream(fout);
		ps.println("ON file via By PrintStream object");
		System.out.println("On console");
		System.err.println("On console by ERR");
		System.setErr(ps);
		System.err.println("On File via Upcasting FIleOutputStream in PrintStream");
		System.out.println("on Console because we have set 'err' variable of system class but we use 'out' variable of systemm class");
		ps.println("On File");
		
	}
}
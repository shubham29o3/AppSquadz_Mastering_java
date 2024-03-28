import java.io.*;

class PrintStream04
{
	public static void main(String...s) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("PS04.txt");
		PrintStream ps=new PrintStream(fout);
	
		FileOutputStream fout1=new FileOutputStream("ps4.txt" , true);
		PrintStream ps1=new PrintStream(fout1);
		
		System.out.println("on console Before seting out in ps");
		PrintStream ps2=System.out;//---------------------------objet ps2 for printing on console not in any file ------by use------- ps2.println();
		System.err.println("on console Before seting err in ps1");
		
		System.setOut(ps);
		System.setErr(ps1);
		System.out.println("OUT on file PS04 because ps object use in PrintStream ");
		System.err.println("ERR on file ps4 because ps object use in PrintStream ");
		//REVERSING -----------------Err in PS04 ie on ps object or Out in ps4 ie on ps1 object----------------------------------
		System.setErr(ps);
		System.setOut(ps1);
		System.out.println("OUT on file ps4 because ps object use in PrintStream ");
		System.err.println("ERR on file PS04 because ps object use in PrintStream ");
		
		System.setOut(ps2);
		ps2.println("After");
		System.out.println("via actual out");
	}
}
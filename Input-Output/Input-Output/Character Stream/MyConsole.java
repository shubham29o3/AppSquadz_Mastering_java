import java.io.*;

class MyConsole
{
	public static void main(String...s) throws IOException
	{
		Console cs=System.console();
		
		if(cs!=null)
		{	System.out.println("Console is Available");	}
		
		System.out.println("Enter the Line");
		
		String s1=cs.readLine();
		System.out.println(s1);
		
		String s2=cs.readLine("Eneter the name(%d chars): " ,5);
		System.out.println(s2);
		
		System.out.println("Eneter the Password");
		char []ps =cs.readPassword();
		char []ps2= cs.readPassword("Enter the password(%d chars) " ,5);
		
		System.out.println(new String(ps));
		System.out.println(new String(ps2));
		
		Reader r=cs.reader();
		int x=r.read();
		System.out.println(x);
		
		PrintWriter pw= cs.writer();
		pw.println("console via printwriter");
	}
}
import java.io.*;
import java.util.*;

class MyScanner
{
	public static void main(String...args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		String s1=" ";
		while(!s1.equals("Stop"))
		{
			s1=sc.nextLine();
			System.out.println(s1);
		}
	}
}
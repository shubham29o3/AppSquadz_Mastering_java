import java.io.*;
import java.util.*;

class MyStringTokenizer
{
	public static void main(String...args)
	{
		String s="Desh = BHARAT ; capital = DELHI ; Country = japan ; capital = TOKYO " ;
		StringTokenizer st=new StringTokenizer( s ,"=;" );
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
	}
}
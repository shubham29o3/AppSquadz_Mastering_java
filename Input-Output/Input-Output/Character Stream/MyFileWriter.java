import java.io.*;

class MyFileWriter
{
	public static void main(String...args) throws IOException
	{
		FileWriter fw=new FileWriter("MyFileWriter.txt");
		String s="HI i,m fr0m F!le Wr!teR";
		
		//fw.write(s);
		char ch[]=s.toCharArray();
		 //fw.write(ch);
		for(int i=0; i<ch.length ; i++)
		{	fw.write(ch[i]);	}
		
		fw.close();
	}
}
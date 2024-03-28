import java.io.*;
class  ReadInChar
{
	public static void main(String...s) throws IOException
	{
		File f=new File("Write.txt");
		char[] ch=new char[ (int)f.length() ];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for(int i=0 ; i<ch.length ; i++)
		{
			System.out.print(ch[i]);
		}
	}
}
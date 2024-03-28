import java.io.*;

class List
{
	public static void main(String...args)  throws IOException
	{
		int count=0;
		File f=new File("D:/JAVA Programs/Input-Output\\Online");
		f.createNewFile();
		/* String  str="hi i am List File";
		byte b[]=str.getBytes();
		for(int i =0 ; i<b.length ; i++)
		{
			System.out.print(b[i]);
		} */
		String[] s =f.list();
		for(String s1 : s)
		{
			count++;
			System.out.println(s1);
		}
		System.out.println("Files are "+ count);
	}
}
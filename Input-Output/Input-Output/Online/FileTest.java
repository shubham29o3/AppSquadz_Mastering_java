import java.io.*;

class FileTest
{
	public static void main(String...s)
	{
		File f=new File("Abc.txt");
		System.out.println(f.exists());
		try{ f.createNewFile(); }
		catch (Exception e){}
		System.out.println(f.exists());
	}
}
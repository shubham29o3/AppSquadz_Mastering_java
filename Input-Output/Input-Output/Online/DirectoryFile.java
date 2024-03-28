import java.io.*;

class DirectoryFile
{
	File f,fi ,f2;
	
	DirectoryFile()
	{
		f=new File( "Folder");
		f.mkdir();
		
		System.out.println(f.exists());
		
		fi=new File(f  , "File.txt");
		
		try{ fi.createNewFile(); }
		catch(Exception e){}
		
		System.out.println(fi.exists());
	}
	public static void main (String...s)
	{
		new DirectoryFile();
	}
}
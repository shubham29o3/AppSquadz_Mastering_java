import java.io.*;
import java.util.zip.*;

class ZipFileBnega
{
	static void methodFileZip(ZipOutputStream zout, String file)  throws Exception
	{
		System.out.println("Convert kr rha hu " + file + " ko Zip file me");
		FileInputStream fin=new FileInputStream(file);
		
		ZipEntry zip=new ZipEntry(file);
		zout.putNextEntry(zip);
		
		byte b []=new byte[fin.available()];
		fin.read(b);
		
		//for writing in console---------------------
		//for(int i=0 ; i< b.length ; i++)
		//System.out.print((char)b[i]);
		
		System.out.println("");
		zout.write(b);
		zout.closeEntry();
		fin.close();
	}
	public static void main(String...s) throws Exception 
	{
		FileOutputStream fout = new FileOutputStream("ismeFilehai.zip");
		ZipOutputStream zipoutput = new ZipOutputStream(fout);
		
		String s1="abc.txt";
		String s2="cde.txt";
		
		methodFileZip(zipoutput , s1);
		methodFileZip(zipoutput , s2);
		
		zipoutput.close();
		fout.close();
	}
}
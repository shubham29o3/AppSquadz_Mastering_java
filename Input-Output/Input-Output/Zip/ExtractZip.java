import java.io.*;
import java.util.zip.*;
import java.util.Enumeration;

class ExtractZip
{
	public static void main(String...s) throws Exception
	{
		ZipFile zpfile= new ZipFile("ZipFle.zip");
		Enumeration enu = zpfile.entries();
		
		while(enu.hasMoreElements())
		{
			ZipEntry zipentry = (ZipEntry)enu.nextElement();
			String str = zipentry.getName();
			System.out.println("name = " + str);
			
			InputStream is = zpfile.getInputStream(zipentry);
			
			FileOutputStream fout= new FileOutputStream(str);
			int length;
			while((length = is.read())!= -1)
				fout.write(length);
			
			is.close();
			fout.close();
			
		}
	}
}

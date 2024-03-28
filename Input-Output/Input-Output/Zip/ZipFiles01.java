import java.io.*;
import java.util.zip.ZipEntry ;
import java.util.zip.ZipOutputStream;

class ZipFiles01
{
	public static void main(String...s) throws Exception
	{
		FileOutputStream fout = new FileOutputStream ("ZipFle.zip");
		ZipOutputStream zout = new ZipOutputStream(fout);
		String file1= "abc.txt";
		String file2= "cde.txt";
		String file3= "efg.txt";
		String file4= "hij.txt";
		String file5= "klm.txt";
		
		addToZipFile(file1 , zout);
		addToZipFile(file2 , zout);
		addToZipFile(file3 , zout);
		addToZipFile(file4 , zout);
		addToZipFile(file5 , zout);
		
		zout.close();
		fout.close();
	}
	
	public static void addToZipFile(String fileName , ZipOutputStream zout) throws FileNotFoundException, IOException
	{
		System.out.println("Writing " + fileName + " to zip file " ) ;
		FileInputStream fin = new FileInputStream(fileName);
		ZipEntry zipentry = new ZipEntry(fileName);
		zout.putNextEntry(zipentry);
		
		byte [] by= new byte[fin.available()];
		fin.read(by);
		zout.write(by);
		zout.closeEntry();
		fin.close();
	}
}
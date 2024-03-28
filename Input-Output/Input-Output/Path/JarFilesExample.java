import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

class JarFilesExample
{
	
	private static void process(Object obj)
	{
		JarEntry jentry=(JarEntry) obj;
		String name=jentry.getName();
		long size = jentry.getSize();
		long compressedSize = jentry.getCompressedSize();
		System.out.println(name + "\t" + size + "\t" + compressedSize);
	}
	
	public static void main(String...s) throws IOException
	{
		JarFile jfobj= new JarFile("D:\\JAVA Programs\\Input-Output\\Zip\\ismeFilehai.zip");
		Enumeration enume=jfobj.entries();
		
		while(enume.hasMoreElements())
		{	process(enume.nextElement());		}
	
	jfobj.close();
	}
}
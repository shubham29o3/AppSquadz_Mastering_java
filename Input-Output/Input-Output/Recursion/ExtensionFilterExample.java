import java.io.File;
import java.io.FilenameFilter;

class ExtensionFilterExample
{
	public static void main(String...s) throws Exception
	{
		String dirname="D:\\JAVA Programs\\Input-Output\\InputStream";
		File f=new File(dirname);
		FilenameFilter filefilter=new ExtensionFilter("java");
		String str[]=f.list(filefilter);
		for(int i=0 ; i<str.length ; i++)
			System.out.println(s[i]);
	}
}
class ExtensionFilter implements FilenameFilter
{
	String ext;
	int i=1;
	 
	ExtensionFilter(String ext)
	{
		this.ext = "." + ext;
	}
	public boolean accept(File dir , String name)
	{
		System.out.println("accept");
		return name.endsWith(ext);
	}
}
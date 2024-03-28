import java.io.File;
import java.io.FileFilter;

class MyFileFilter
{
	public static void main(String...s)
	{
		String dirPath = "D:\\JAVA Programs\\Input-Output\\Recursion";
		File dir = new File(dirPath);
		
		MyFilter fltr=new MyFilter();
		
		File[] filearry = dir.listFiles(fltr) ;
		for(int i=0 ; i<filearry.length ; i++)
		{
			if(filearry[i].isFile())
				System.out.println(filearry[i].getPath() + "  (File)  ");
			
			else
				System.out.println(filearry[i].getPath() + "      (Directory) ");
		}
	}
}
class MyFilter implements FileFilter
{
	public boolean accept(File f)
	{
		int count=0;
		count++; 
		System.out.println("accept " + count++);
		if(f.isFile()|| f.isDirectory())
		{
			String filename = f.getName().toLowerCase();
			if(filename.endsWith(".java"))
				return true;
		}
		return false;
	}
}
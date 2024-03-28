import java.io.File;

class DeleteFolder
{
	static void delFolder(File f)
	{
		File[] files =f.listFiles(); 
		for(File fi : files)
		{
			System.out.println(fi);
			if(fi.isDirectory())
			{
				delFolder(fi);
				fi.delete();
			}
			fi.delete();
		}
	}
	public static void main(String...s)
	{
		File f1=new File("D:\\JAVA Programs\\Input-Output\\Recursion\\New folder");
		delFolder(f1);
		fi.delete();
	}
}
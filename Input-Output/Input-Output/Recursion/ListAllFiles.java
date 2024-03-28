import java.io.File;

class ListAllFiles
{
	public static void main(String...s) throws Exception
	{
		File f=new File("D:\\JAVA Programs\\Input-Output\\Recursion");
		File [] file=f.listFiles();
		for(int i=0 ; i<file.length ; i++)
		{
			if(file[i].isFile())
			{
				System.out.println(file[i].getPath()+ " is file");
			}
			else if(file[i].isDirectory())
			{
				System.out.println(file[i].getPath()+ " is Directory");
			}
		}
	}
}
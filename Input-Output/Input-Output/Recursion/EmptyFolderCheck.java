import java.io.File;
class EmptyFolderCheck
{
	public static void main(String...s) throws Exception
	{
		File f=new File("D:\\JAVA Programs\\Input-Output\\Recursion\\New folder\\");
		checkmethod(f);
	}
	static void checkmethod(File file)
	{
		if (file.isDirectory())
		{
			String[] str=file.list();
			if(str.length>0)
			{
				System.out.println("The " + file.getPath() + " is not empty \n and the files inside are");
				for(String s1 : str)
					System.out.println(s1);
			}
			else
				System.out.println("Folder is Empty");
		}
	}
}
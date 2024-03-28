import java.io.File;

class TreeDirectory
{
	public static void main(String []args) throws Exception
	{
		File f=new File(args[0]);
		if(!f.exists())
		{
			System.out.println("Dead " + args[0] + " is not exists");
			return;
		}
		treeMethod(args[0]);
	}
	
	static void treeMethod(String filename)
	{
		File file=new File(filename);
		if(file.isDirectory())
		{
			String [] str = file.list();
			for(int i=0 ; i<str.length ; i++)
				treeMethod(filename + File.separator + str[i]);
			
		}
		else
			System.out.println(filename);
		return;
	}
}
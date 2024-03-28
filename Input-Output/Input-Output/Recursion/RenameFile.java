import java.io.File;

class RenameFile
{
	public static void main(String...s) throws Exception
	{
		File f1=new File("File1.txt");
		f1.createNewFile();
		File f2=new File("File2.txt");
		f2.createNewFile();
		File f3=new File("File3.txt");
		
		f1.renameTo(f2);
		//f3.renameTo(f1);
		
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		System.out.println(f3.getName());
		
		
	}
}
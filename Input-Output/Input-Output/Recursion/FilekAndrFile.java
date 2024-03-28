import java.io.File;

class FilekAndrFile
{
	static void method(File f)
	{
		File [] fm=f.listFiles();
		for(File f1 : fm)
		{
			if(f1.isDirectory())
			{
				method(f1);
				System.out.println(f1);
			}
			System.out.println(f1);
		}
		
	}
	public static void main(String...s) throws Exception
	{
		File file=new File("C:\\Program Files");
		System.out.println(file.exists());		
		System.out.println(file.isDirectory());
		method(file);
	}
}
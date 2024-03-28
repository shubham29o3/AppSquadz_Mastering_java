import java.io.File;

class CreateFile
{
	public static void main(String...args) throws Exception
	{
		File f1=new File("File1.txt");
		File f2=new File("File2.txt");
		
		boolean s=f1.exists();
		System.out.println(s);
		
		boolean b1=f1.createNewFile();
		if(!b1)
			System.out.println(f1 + " ---could not be ceated------");
		else
			System.out.println(f1 + " is created sucessfully");
	}
}
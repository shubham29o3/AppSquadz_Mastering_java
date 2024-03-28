import java.io.File;
class DeleteFile
{
	public static void main(String...args) throws Exception
	{
		File f1=new File("File1.txt");
		
		boolean b1=f1.exists();
		System.out.println("File is created " + b1 );
		
		f1.createNewFile();
		boolean b2=f1.exists();
		System.out.println("File is created " + b2);
		
		f1.delete();
		boolean b3=f1.exists();
		System.out.println("********File is deleted-----is file created- " + b3);
		
		f1.createNewFile();
		boolean b4=f1.exists();
		System.out.println("File is created " + b4);
		
		File f2=new File("File2.txt");
		f2.createNewFile();
		boolean b5=f2.exists();
		System.out.println("File F2 is created " + b5);
		
		f1.createNewFile();
		boolean b6= f1.exists();
		System.out.println("File is created " + b6);
		
		
		f2.deleteOnExit();
		boolean b7 = f2.exists();
		System.out.println("File is created " + b7);
	}
}
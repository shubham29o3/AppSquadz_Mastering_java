import java.io.File;

class CreateDeleteRename
{
	static void printFileDetails(File f)
	{
		System.out.println("Absolute Path " + f.getAbsoluteFile() );
		System.out.println("File Exists " + f.exists() );
	}
	public static void main(String...s) throws Exception
	{
		File f1=new File("File_1.txt");
		printFileDetails( f1 );
		
		//Create new File
		boolean fileBN = f1.createNewFile();
		if(!fileBN)
			System.out.println( f1 +" is not created ");
		
		printFileDetails(f1);
		
		//Delete thw file f1
		f1.delete();
		System.out.println("File is deleted ");
		printFileDetails(f1);
		
		//recreate  the file
		f1.createNewFile();
		printFileDetails(f1);
		
		//LEt tell the JVM to delete the file on exit
		f1.deleteOnExit();
		System.out.println("after applying deleOnExit ");
		printFileDetails(f1);
		
		//create the new file and rename it
		File f2=new File("File_2.txt");
		File f3=new File("File_3.txt");
		
		fileBN=f2.createNewFile();
		if(fileBN || f2.exists())
		{
			printFileDetails(f2);
			printFileDetails(f3);
			
			boolean renameflag=f2.renameTo(f3);
			if(!renameflag)
				System.out.println("couldnot rename " + f2);
			
			printFileDetails(f2);
			printFileDetails(f3);
		}
	}
}
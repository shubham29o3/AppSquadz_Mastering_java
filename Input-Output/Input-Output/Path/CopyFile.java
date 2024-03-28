import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.DirectoryNotEmptyException;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;

class CopyFile
{
	public static void main(String...s)
	{
		Path copypath=Paths.get("D:\\JAVA Programs\\Input-Output\\Path/PathDemo.java");
		Path paste=Paths.get("D:\\JAVA Programs\\Input-Output\\Path\\COPY.java");
		
		try
		{
			Path p=Files.copy(copypath ,paste, REPLACE_EXISTING, COPY_ATTRIBUTES);
			System.out.println(copypath + " has been copied ");
		}
		catch(FileAlreadyExistsException e)
		{	System.out.println(paste + " already exist in file ");		}
		catch( DirectoryNotEmptyException e)
		{	System.out.println(paste + " is not empty " );		}
		catch(Exception e)
		{  	e.printStackTrace();		}
	}
}
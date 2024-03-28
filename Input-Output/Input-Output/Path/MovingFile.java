import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import java.io.IOException;
import java.nio.file.*;
//////////////////////////////////FIRST COPY PROGRAM UST BE RUN\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
class MovingFile
{
	public static void main(String...s) throws Exception
	{
		Path filepath= Paths.get("D:\\JAVA Programs\\Input-Output\\Path/Recycle.bin");
		Path destination=Paths.get("D:\\JAVA Programs\\Input-Output/DeleteIt.txt");
		
		
		Path p=Files.move(filepath , destination , ATOMIC_MOVE);
		System.out.println("File has been Moved Succesfully");
	}
}
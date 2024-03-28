import java.nio.file.Path;
import java.nio.file.Paths;

class PathDemo
{
	static void methodfile(Path p)
	{
		System.out.println("Details for path " + p);
		
		int count = p.getNameCount();
		System.out.println("Name Count "  + count);
		
		for(int i=0 ; i< count ; i++)
		{
			Path naam=p.getName(i);
			System.out.println("Name at index  " + i + " is " + naam);
		}
		Path papa=p.getParent();
		Path root=p.getRoot();
		Path filenaam=p.getFileName();
		
		System.out.println("Parent " + papa + " , Root " + root + " , File NAme " + filenaam);
		System.out.println("Absolute Path "  + p.isAbsolute());
	}
	
	public static void main(String...s)
	{
		Path p1=Paths.get("D:\\JAVA Programs\\Input-Output\\Recursion");
		methodfile(p1);
		//Path p2=Paths.get("PathDemo.java");
		//methodfile(p2);
	}
}
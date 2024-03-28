import java.io.FileInputStream ;
import java.util.Scanner;

class CreateTable
{
	public static void main (String...args)
	{
		try
		{
			FileInputStream fin=new FileInputStream("Text_file.txt");
			Scanner sc=new Scanner(fin);
			sc.useDelimiter("/");
			String name=" ";
			while(sc.hasNext())
			{
				name=sc.next();
				System.out.println(name);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
import java.io.BufferedInputStream;
import java.io.FileInputStream;

class BufferedIS
{
	public static void main (String...s)
	{
		String srcFile="xyz.txt";
	//	FileInputStream fis=new FileInputStream("xyz.txt");
		//BufferedInputStream bIS=new BufferedInputStream(fis);
		try(BufferedInputStream bIS= new BufferedInputStream(new FileInputStream(srcFile)))
		{	//READ ONE BYTE AT A TIME AND DISPLAY IT
			byte bData;
			while((bData = (byte)bIS.read()) !=-1 )
			{	System.out.print((char)bData);	}
		}
		catch(Exception e)
		{	e.printStackTrace();	}
	}
}
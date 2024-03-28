import java.io.*;

class InputFile
{
	public static void main(String...s) throws IOException
	{
		FileInputStream is=new FileInputStream("FileOutput.txt");
		int i=0;
		while((i=is.read())!=-1)
			System.out.print((char)i);
		is.close();
	}
}
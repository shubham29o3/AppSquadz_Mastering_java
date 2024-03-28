import java.io.*;

class Output
{
	FileOutputStream f;
	
	Output()     throws IOException
	{
		f=new FileOutputStream("out.txt"); 
		f.write('a');
		f.write(65);
		String s="Hi program";
		byte[] b=s.getBytes();
		f.write(b);
		f.close();
	}
	public static void main(String...sa)    throws IOException
	{
		new Output();
	}
}
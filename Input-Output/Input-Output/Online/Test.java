import java.io.*;

class Test
{
	File f;
	Test()
	{
		f=new File("abc.txt");
		System.out.println(f.exists());
		f.mkdir();//dir=directory
		System.out.println(f.exists());
	}
	public static void main(String...s)
	{
		new Test();
	}
}
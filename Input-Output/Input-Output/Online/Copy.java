import java.io.*;

class Copy
{
	public static void main(String...s) throws Exception
	{
		FileInputStream fi=new FileInputStream("D:\\InterView\\Abstract Related Question.java");
		FileOutputStream fo=new      FileOutputStream("Copy.txt");
		String st="HEllo-------------------- ";
		byte[] str=st.getBytes();
		fo.write(str);
		int data ;
		while( (data=fi.read()) !=-1)
		{
			fo.write(data);
		}
		
	}
}